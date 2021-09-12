#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float c, k;
	
	printf("Digite a temperatura em Celsius para converter em Kelvin: ");
	scanf("%f",&c);
	
	k = c + 273,15;
	
	printf("A temperatura em kelvin e: %f",k);
	
	return 0;
}
