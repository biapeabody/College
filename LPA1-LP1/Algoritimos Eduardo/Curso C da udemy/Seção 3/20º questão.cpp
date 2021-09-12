#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float kg, libras;
	
	printf("Digite o valor em Kg: ");
	scanf("%f",&kg);
	
	libras = kg/0.45;
	
	printf("O valor em libras e: %f", libras);
	
	return 0;
}
