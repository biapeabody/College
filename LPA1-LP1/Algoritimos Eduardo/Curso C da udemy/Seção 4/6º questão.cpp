#include<stdio.h>
#include<stdlib.h>

int main(){
	int num1, num2, sub;
	
	printf("Digite um numero: ");
	scanf("%i",&num1);
	
	printf("Digite outro numero: ");
	scanf("%i",&num2);
	
	if(num1>num2){
		printf("O maior numero e %i\n",num1);
		sub = num1 - num2;
		printf("e a diferenca entre os dois e %i!",sub);
	}else if(num1==num2){
		printf("Os numeros sao iguais!\n");
		printf("A diferenca entre eles e 0!");
	}else{
		printf("O maior numero e %i!\n",num2);
		sub = num2 - num1;
		printf("A diferenca entre eles e %i",sub);
	}
	
	return 0;
}
