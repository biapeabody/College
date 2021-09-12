//verifica se o numero é positivo, nulo ou negativo e retorna 1, -1 ou 0 dependendo do valor digitado;
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>

int verificacao(int x);

int main(){
	setlocale(LC_ALL, "Portuguese");
	int num;
	
	printf("Digite um número: ");
	scanf("%d",&num);
	
	printf("%d",verificacao(num));
	
	return 0;
}

int verificacao(int x){
	if(x>0){
		return 1;
	}else if(x == 0){
		return 0;
	}else{
		return -1;
	}
}
