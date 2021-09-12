#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float A, B, C;
	
	printf("Digite o valor de um lado de um triangulo: ");
	scanf("%f",&A);
	
	printf("Digite o valor de outro lado de um triangulo: ");
	scanf("%f",&B);
	
	printf("Digite o valor do ultimo lado de um triangulo: ");
	scanf("%f",&C);
	
	if(A == B && A == C){
		printf("O triangulo e equilatero!!");
	}else if(A == B || B == C || C == A){
		printf("O trinangulo e isoceles!!");
	}else{
		printf("O triangulo e escaleno!!");
	}
	
	return 0;
}
