#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float km, m;
	
	printf("Digite a velocidade em km/h para saber em m/s: ");
	scanf("%f",&km);
	
	m = km/3.6;
	
	printf("A velocidade em m/s e: %f",m);
	
	return 0;
}
