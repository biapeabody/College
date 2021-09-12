#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float cel, fah;
	
	printf("Digite a temperatura em celsius para a conversao: ");
	scanf("%f",&cel);
	
	fah = (cel*9/5)+32;
	
	printf("A temperatura em fahrenheit e: %f",fah);
	
	return 0;
}
