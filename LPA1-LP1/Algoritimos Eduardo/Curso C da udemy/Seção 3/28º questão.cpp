#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	int val1, val2, val3, val1_1, val2_1, val3_1, resultado;
	
	printf("Digite o primeiro valor: ");
	scanf("%i",&val1);
	
	printf("Digite o segundo valor: ");
	scanf("%i",&val2);
	
	printf("Digite o terceiro valor: ");
	scanf("%i",&val3);	
	
	val1_1 = val1;
	val2_1 = val2;
	val3_1 = val3;
	
	resultado = (val1*val1_1) + (val2*val2_1) + (val3*val3_1);
	
	printf("A soma do quadrado dos tres valores e: %i",resultado);
	
	return 0;
}
