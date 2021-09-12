#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	int soma_num_dig = 0, media_num_dig, maior_num_dig, menor_num_dig, media_num_par, i, alternador, num1, quant_num_dig = 0, num_par = 0, somador_num_par = 0;
	int altern;
	
	printf("Qual a quantidade de numeros que deseja digitar: ");
	scanf("%d",&num1);
	system("cls");
	
	int numeros_digit[num1];
	
	for(i=0 ; i<num1 ; i++){
		printf("Digite um numero: ");
		scanf("%d",&numeros_digit[i]);
		printf("\n");
		soma_num_dig += numeros_digit[i];
		if(numeros_digit[i] % 2 == 0){
			num_par += 1;
			somador_num_par += numeros_digit[i];
		}
		maior_num_dig = numeros_digit[i];
		if(numeros_digit[i]>maior_num_dig){
			maior_num_dig = numeros_digit[i];
		}
	}
	system("cls");
	
	quant_num_dig = num1; //quantidade de números digitados
	media_num_dig = soma_num_dig / num1; //media dos números digitados
	media_num_par = somador_num_par / num_par; // media dos números pares
	
	for(i=0 ; i<1 ; i++){
		printf("A quantidade de numeros digitados foi: %d\n",quant_num_dig);
		printf("A soma dos numeros digitados e: %d\n",soma_num_dig);
		printf("A media dos numeros digitados e: %d\n",media_num_dig);
		printf("A media dos numeros pares digitados e: %d\n",media_num_par);
		printf("O maior numero digitado e: %d\n",maior_num_dig);
	}
	
	return 0;
}
