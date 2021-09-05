from cliente import Pedido
from lanchonete import pratos, showMenu


nomeCliente = input("Digite seu nome: ")

print('\n')
showMenu()
print('\n')

pedido = int(input("Digite o id do prato: "))

qtd = int(input("Digite a quantidade de pratos: "))

cliente = Pedido(nomeCliente, pedido, qtd)

cliente.prato.append(2)

print(cliente.__dict__)
# print(type(cliente.prato))