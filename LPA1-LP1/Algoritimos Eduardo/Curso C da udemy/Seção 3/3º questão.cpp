#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	
	//declaração das variáveis
	int num1, num2, num3, conta;
	
	//pergunta e recebe o 1º valor
	printf("Digite o primeiro valor: ");	
	scanf("%i",&num1);
	
	//pergunta e recebe o 2º valor
	printf("Digite o segundo valor: ");	
	scanf("%i",&num2);
	
	//pergunta e recebe o 3º valor
	printf("Digite o terceiro valor: ");	
	scanf("%i",&num3);
	
	//operação matemática
	conta = (num1 + num2 + num3);
	
	//imprimi o resultado
	printf("A soma dos tres valores e: %i",conta);
	
	return 0;
	
}
