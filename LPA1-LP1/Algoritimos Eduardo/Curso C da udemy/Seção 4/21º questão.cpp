#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	int decisao, num1, num2, alternador, result;
	
	printf("1-Soma de 2 numeros\n2-Diferenca entre 2 numeros\n3-Produto entre 2 numeros\n4-Divisao entre 2 numeros\n\n");
	printf("Digite o numero da opcao que deseja realizar: ");
	scanf("%i",&decisao);
	
	if(decisao==1){
		printf("Digite o primeiro numero: ");
		scanf("%i",&num1);
		printf("Digite o segundo numero: ");
		scanf("%i",&num2);
		result = num1 + num2;
		printf("O resultado da soma e: %i",result);
	}else if(decisao==2){
		printf("Digite o primeiro numero: ");
		scanf("%i",&num1);
		printf("Digite o segundo numero: ");
		scanf("%i",&num2);
		result = num1 - num2;
		printf("O resultado da diferenca e: %i",result);
	}else if(decisao==3){
		printf("Digite o primeiro numero: ");
		scanf("%i",&num1);
		printf("Digite o segundo numero: ");
		scanf("%i",&num2);
		result = num1 * num2;
		printf("O resultado do produto e: %i",result);
	}else if(decisao==4){
		printf("Digite o primeiro numero: ");
		scanf("%i",&num1);
		printf("Digite o segundo numero: ");
		scanf("%i",&num2);
		if(num2==0){
			printf("Impossivel dividir por 0!!!");
			return 0;
		}
		result = num1 / num2;
		printf("O resultado da divisao e: %i",result);
	}else{
		printf("\nOpcao invalida!!");
	}
	
	return 0;
}
