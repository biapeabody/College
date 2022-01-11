from random import uniform
from time import sleep
from threading import Thread, Lock
pratos = [0, 0, 0, 0, 0]

nomes = ['Jorge',
         'Carvalho',
         'Williames',
         'Romulo',
         'Jackson']

class Filosofo(Thread):
    def __init__(self, nome, garfoEsq, garfoDir):
        Thread.__init__(self)
        self.nome = nome
        self.garfoEsq = garfoEsq
        self.garfoDir = garfoDir

    def run(self):
        while self.execute:
            print(f"\n {self.nome} está pensando")
            sleep(uniform(5, 15))
            self.comer()

    def comer(self):
        garfo1, garfo2 = self.garfoEsq, self.garfoDir

        while self.execute:
            garfo1.acquire(True)

            locked = garfo2.acquire(False)
            if locked:
                break
            garfo1.release()
        else:
            return

        print(f"\n {self.nome} começou a comer")
        sleep(uniform(5, 10))
        print(f"\n {self.nome} parou de comer")

        pratos[nomes.index(self.nome)] += 1
        print(pratos)
        garfo1.release()
        garfo2.release()
