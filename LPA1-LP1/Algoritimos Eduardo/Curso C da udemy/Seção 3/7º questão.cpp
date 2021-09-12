#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float f, c;
	
	printf("Digite a temperatura em fahrenheit: ");
	scanf("%f",&f);
	
	c = 5*(f-32)/9;
	
	printf("O valor em celsius e: %f",c);
	
	return 0;
}
