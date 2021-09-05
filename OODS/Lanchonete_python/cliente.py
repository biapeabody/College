class Pedido:
    def __init__(self, nomeCliente, prato, quantidade):
        self.nomeCliente = nomeCliente
        self.prato = [prato]
        self.quantidade = quantidade
        # self.valTotal = valTotal