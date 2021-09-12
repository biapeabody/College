#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	int graus;
	float rad;
	
	printf("Digite o valor do angulo em graus: ");
	scanf("%i",&graus);
	
	rad = (graus*3.14)/180;
	
	printf("O valor em radiano e: %f",rad);
	
	return 0;
}
