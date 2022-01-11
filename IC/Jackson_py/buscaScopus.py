from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import urllib.parse as urlparse
from urllib.parse import parse_qs
import csv, time

arquivo = '/home/luis/Codigos_Programação/College/IC/Jackson_py/scopus_R.csv'

# ALTERAR
def extraiEIds(links):
    eids = []
    temp = ''
    cont = 0
    for l in links:
        estripado = urlparse.urlparse(l)
        temp = temp + parse_qs(estripado.query)['eid'][0]
        if cont < 500:
            temp = temp + ' OR '
            cont += 1
        else:
            eids.append(temp)
            cont = 0
            temp = ''
    return eids

# ALTERAR
def recuperaEnderecos():
    identificadores = []
    with open(arquivo) as arquivo_csv:
        leitor = csv.DictReader(arquivo_csv, delimiter=',')
        for coluna in leitor:
            if coluna['Link'] != '':
                identificadores.append(coluna['Link'])
            else:
                break
    #print(identificadores)
    return identificadores

driver = webdriver.Firefox(executable_path=GeckoDriverManager().install())
wait = WebDriverWait(driver, 10)

input("Configura o proxy e dá enter abestado")

driver.get("https://www.scopus.com/")

# input("Faça o login")

#busca o primeiro artigo
#driver.get("https://www.scopus.com/inward/record.uri?eid=2-s2.0-0014796643&doi=10.1037%2fh0029115&partnerID=40&md5=8728805ecc44683fef690984054de0c6")
#driver.find_element_by_xpath('/html/body/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/section[2]/ul/li[6]/button/span[2]').click()

#cria a lista
#nomelista = input("Insira o nome da lista")
#driver.find_element_by_xpath('//*[@id="listName"]').send_keys(nomelista)
#driver.find_element_by_xpath('//*[@id="saveTolistSubmit"]').click()

#input("Salvou?")

papers = recuperaEnderecos() # refazer
eids = extraiEIds(papers) # refazer
print('eids: ' + eids)

'''
  - pegar cada link do CSV
  - colocar na barra de pesquisa avançada: TITLE("título do artigo")
  - pegar:
    - título
    - EID
    - Link
    - Subject área
    - OBS: Caso tenha mais de uma subject área, inserir igualmente numa mesma linha porém com a nova subject área
  - Inserir esses novos dados num novo CSV
'''

for i in eids:
    # print(i)
    driver.get('https://www.scopus.com/search/form.uri?display=advanced')
    driver.find_element_by_xpath('//*[@id="searchfield"]').clear()
    driver.find_element_by_xpath('//*[@id="searchfield"]').send_keys('EID('+i+')')
    driver.find_element_by_xpath('//*[@id="advSearch"]').click()
    time.sleep(6) # seconds ( NÃO MEXER )
    element = wait.until(EC.element_to_be_clickable((By.ID, 'selectAllCheck')))
    #seleciona todos e salva na lista
    
    driver.find_element_by_xpath('/html/body/div[1]/div/div[1]/div[1]/div/div[3]/form/div[4]/div[2]/div/div/section[1]/div/div[1]/div[1]/div/div/ul/li[1]/label').click()
    driver.find_element_by_xpath('//*[@id="saveListResults"]').click()
    time.sleep(6) # seconds
    #element = wait.until(EC.element_to_be_clickable((By.ID, 'saveToList')))
    #pesquisa e salva do segundo em diante na lista criada
    print('Salvando ')
    time.sleep(6) # seconds
    element = wait.until(EC.element_to_be_clickable((By.ID, 'selectListOption')))
    driver.find_element_by_xpath('//*[@id="addListId-button"]').click()
    driver.find_element_by_xpath('//*[@id="ui-id-3"]').click()
    driver.find_element_by_xpath('//*[@id="saveTolistSubmit"]').click()
    time.sleep(3) # seconds

#faz o download de todos no formato .bib

'''

  SALVAR O NOVO CSV

'''


input("Terminou mesmo?")
input('Segue manual ;)')

driver.close()
