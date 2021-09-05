pratos = []

class Menu:
    def __init__(self, nome, id, preco):
        self.nome = nome
        self.id = id
        self.preco = preco
        
    def __repr__(self):
        return "{}-----{}-----R$: {}".format(self.id, self.nome, self.preco)


prato1 = Menu('Macarrao', 1, 15.0)
prato2 = Menu('Lasanha', 2, 25.0)
prato3 = Menu('Pizza', 3, 15.0)
prato4 = Menu ('Coxinha', 4, 20.0)

pratos.append(prato1.__repr__())
pratos.append(prato2.__repr__())
pratos.append(prato3.__repr__())
pratos.append(prato4.__repr__())

def showMenu():
    for i in range(0, pratos.__len__()):
        print(pratos[i])