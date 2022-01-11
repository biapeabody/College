from random import uniform
from time import sleep
from threading import Lock
from filosofo import Filosofo, nomes

garfos = [Lock() for _ in range(5)]

mesa = [Filosofo(nomes[i], garfos[i % 5], garfos[(i + 1) % 5])
        for i in range(5)]

for _ in range(5):
    Filosofo.execute = True
    for filosofo in mesa:
        try:
            filosofo.start()
            sleep(2)
        except RuntimeError:
            pass
    sleep(uniform(5, 15))
    Filosofo.execute = False