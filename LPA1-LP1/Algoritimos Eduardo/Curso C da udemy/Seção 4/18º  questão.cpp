#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	printf("SOMA     SUBTRACAO\n\nDIVISAO  MULTIPLICACAO\n\n");
	
	char soma[]="soma";
	char subtracao[]="subtracao";
	char divisao[]="divisao";
	char multiplicacao[]="multiplicacao";
	
	char operacao[20];
	float num1, num2, result;
	
	printf("\nDigite a operacao que deseja realizar: ");
	gets(operacao);
	
	printf("Digite 2 numeros:\n");
	scanf("%f",&num1);
	scanf("%f",&num2);
	
	if(strcmp(operacao, soma)==0){
		result = num1 + num2;
		printf("\nO resultado da soma e: %.2f",result);
	}else if(strcmp(operacao, subtracao)==0){
		result = num1 - num2;
		printf("\nO resultado da subtracao e: %.2f",result);
	}else if(strcmp(operacao, divisao)==0){
		result = num1 / num2;
		printf("\nO resultado divisao e: %.2f",result);
	}else if(strcmp(operacao, multiplicacao)==0){
		result = num1 * num2;
		printf("\nO resultado da multiplicacao e: %.2f",result);
	}else{
		printf("operacao invalida!");
	}
	
	return 0;
}
