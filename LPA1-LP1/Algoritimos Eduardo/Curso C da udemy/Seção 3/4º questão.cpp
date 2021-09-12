#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	//declaração de variáveis
	float numero, quadrado, operacao;
	
	//pede e recebe o número
	printf("Digite um valor e saiba o seu quadrado: ");
	scanf("%f",&numero);
	
	quadrado = numero;
	
	//operação matemática
	operacao = numero * quadrado;
	
	printf("O quadrado do numero e: %f",operacao);
	
	return 0;
}
