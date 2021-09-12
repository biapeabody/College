#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float milhas, km;
	
	printf("Digite um valor em milhas: ");
	scanf("%f",&milhas);
	
	km = 1.61 * milhas;
	
	printf(" O valor em Km e: %f", km);	
	
	return 0;
}
