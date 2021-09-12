#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float num, result;
	
	printf("Digite um numero para saber a sua quinta parte: ");
	scanf("%f",&num);
	
	result = num/5;
	
	printf("A quinta parte do numero e: %f",result);
	
	return 0;
}
