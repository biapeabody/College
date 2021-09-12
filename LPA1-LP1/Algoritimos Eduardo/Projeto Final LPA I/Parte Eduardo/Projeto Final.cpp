#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void parte1(){
	
	//todas as variáveis usadas
	int comparacao, comparacao2;
	char nomedoenca[50];
	char agente[50];
	char ativacao[20]; 
	char transmissor1[]="vetor";
	char transmissor2[]="etiologico";
	char vetor[20];
	
	//pergunta do nome
	printf("Digite o nome da doenca: ");
	gets(nomedoenca);
	printf("\n");
	
	//pergunta d tipo e qual o tipo
	printf("OBS.:Digite vetor ou etiologico!\n");
	printf("A doenca e transmitida por vetores ou agente etiologicos : ");
	gets(ativacao);
	printf("\n");
	comparacao=strcmp(ativacao,transmissor1);
    if(comparacao==0){
    	printf("Qual desses se assemelha mais ao Vetor: \nA)Mamiferos\nB)Aves\nC)Peixes\nD)Insetos\nResposta:");
    	gets(vetor);
    	printf("\n");
	}
    else if(comparacao!=0){
		printf("Qual desses se assemelha mais ao agente etiologico: \nA)Artropodes\nB)Metazoarios\nC)Protozoarios\nD)Fungos\nE)Micoplasmas\nF)Clamidias\nG)Rickettsias\nH)Bacterias\nI)Virus\nJ)Prions\nResposta: ");
		gets(vetor);
		printf("\n");
	}
     
    char localizacao[20];
	
	printf("Qual o tipo da sua localizacao: \nA)Sitio\nB)Cidade\nC)Campo\nD)Ilha\nResposta: ");
	gets(localizacao); 
     
}

main(){
	
	parte1();
	
}
