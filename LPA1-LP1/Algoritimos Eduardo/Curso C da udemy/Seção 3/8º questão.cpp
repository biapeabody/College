#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float k, c;
	
	printf("Digite a temperatura em Kelvin para converter em celsius: ");
	scanf("%f",&k);
	
	c = k - 273,15;
	
	printf("A temperatura em kelvin e: %f",c);
	
	return 0;
}
