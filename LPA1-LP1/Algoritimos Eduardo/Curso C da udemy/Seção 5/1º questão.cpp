#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	int i, num, nums = 0;
	
	printf("Digite um numero: ");
	scanf("%i",&num);
	if(num%3 != 0){
		printf("Esse numero e invalido!!!");
		return 0;
	}
	
	for(i = 0 ; i<=4 ; i++){
		nums = num*i;
		printf("\n%i",nums);
	}
	
	return 0;
}
