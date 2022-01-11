# Carrega a biblioteca bibliometrix
library(bibliometrix)
library(dplyr)

load("/home/luis/Codigos_Programação/College/IC/bibliometria/computer_TI_clean.Rda")

# View(M)

# write.csv(M, "./teste.csv", row.names = FALSE)

# Remove linha duplicada
M <- M[-c(500),]
M <- M[-c(1177),]
M <- M[-c(1177),]
M <- M[-c(3612),]
M <- M[-c(3615),]
M <- M[-c(4611),]

N <- termExtraction(M, Field = "AB", ngrams = 2, 
                                 stemming=TRUE,language="english",
                                 remove.numbers=TRUE, remove.terms=NULL, keep.terms=NULL, verbose=TRUE)

# Passo 1
NetMatrix <- biblioNetwork(M, analysis="co-occurrences", network="abstract", sep=";")

# Passo 2 
net = networkPlot(NetMatrix, normalize="association", n=30, Title="Test plot", type="fruchterman", size=5, edgesize=5, labelsize=0.7)
