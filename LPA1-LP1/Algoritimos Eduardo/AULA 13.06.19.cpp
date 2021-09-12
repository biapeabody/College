#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	
	struct Jogador{
	
	char nome[20];
	char posicao[20];
	int idade;
	float altura;
	
    };
   
   int i, jogadores=2;
   struct Jogador jogador[11];
   
   for(i=0 ; i<jogadores ; i++){
    printf("Qual o nome do jogador: ");
	gets(jogador[i].nome);
	printf("Qual a posicao do jogador: ");
    gets(jogador[i].posicao);
    printf("Qual a idade do jogador: ");
    scanf("%i",&jogador[i].idade);
    printf("Qual a altura do jogador: ");
    scanf("%f",&jogador[i].altura);
    fflush(stdin);
    printf("\n");
   } 
    
    for(i=0 ; i<jogadores ; i++){
    	//puts("O nome do jogador e",jogador[i].nome);
    	printf("A posicao do jogador e: %s\n\n",jogador[i].posicao);
    	printf("A idade do jogador e: %i\n\n",jogador[i].idade);
    	printf("A altura do jogador e: %f\n\n\n",jogador[i].altura);
	}
	
}
