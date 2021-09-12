#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	int idade, tempo;
	
	printf("Digite a idade do trabalhador: ");
	scanf("%i",&idade);
	
	if(idade<65){
		printf("Voce nao tem idade suficiente ainda!!");
		return 0;
	}
	
	printf("\n");
	
	printf("OBS.: O tempo e em anos!!\n");
	printf("Digite o tempo de trabalho: ");
	scanf("%i",&tempo);
	
	if(tempo<30){
		printf("\nVoce nao tem tempo suficiente ainda!!");
	}else{
		printf("\nVoce pode se aposentar!!!");
	}
	
	return 0;
}
