#Dupla Luis Eduardo e Will Azevedo 
from threading import Thread
from time import sleep

vector = ["j", "n", "7", "8", "9", "x", "c", "k", "l", "m", "4", "y", "1", "2", "y", "q", "ç", "3"]
print(f'Vetor inicial: {vector}')
asciiValue = []

def threadLetras(args):
  try:
    for i in range(args):      
      if asciiValue[i] >=97 and asciiValue[i] <=122: 
        if asciiValue[i] +1 == asciiValue[i+1] == asciiValue[i+2]-1:
          print(f'SEQUÊNCIA DE LETRA: {chr(asciiValue[i])}, {chr(asciiValue[i + 1])}, {chr(asciiValue[i + 2])}')      
          del asciiValue[i]
          del asciiValue[i]
          del asciiValue[i]
  except Exception as e:
    return 0

def threadNumero(args):
  for character in vector:
    asciiValue.append(ord(character))
  try:
    for i in range(args):
      if asciiValue[i] >=48 and asciiValue[i] <=57: 
        if asciiValue[i] +1 == asciiValue[i+1] == asciiValue[i+2]-1:
          print(f'SEQUÊNCIA NUMÉRICA: {chr(asciiValue[i])}, {chr(asciiValue[i + 1])}, {chr(asciiValue[i + 2])}')   
          del asciiValue[i]
          del asciiValue[i]
          del asciiValue[i]                
  except Exception as e:
    return 0

if __name__ == "__main__":
    threadNumber = Thread(target = threadNumero, args = (len(vector)-2, ))
    threadLetters = Thread(target = threadLetras, args = (len(vector)-2, ))
    threadNumber.start()
    threadNumber.join()
    threadLetters.start()
    threadLetters.join()
    
    newVector = []
    for c in asciiValue:
        newVector.append(chr(c))
    print (f'Vetor atualizado: {newVector}')