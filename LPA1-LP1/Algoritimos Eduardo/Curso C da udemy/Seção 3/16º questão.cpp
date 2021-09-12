#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float pol, cm;
	
	printf("Digite as polegadas para conversao: ");
	scanf("%f",&pol);
	
	cm = pol * 2.54;
	
	printf("Convertido em centimetros e: %f",cm);
	
	return 0;
}
