#include<stdio.h>

main(){
	
	int num, razao, cont=0, PA, soma, n, n2;
	
	n2=n;
	
	printf("Informe o primeiro elemento da PA: \n");
	scanf("%i",&num);
	
	printf("Digite um numero para a razao: \n");
	scanf("%i",&razao);
	
	printf("Digite um numero para ser o n'esimo numero: \n");
	scanf("%i",&n);
	
	while(cont<=n){
		cont++;
		soma=num+razao;
		for(cont=1 ; cont<=n ; cont++){
			printf("%i ",(soma+=razao)-razao);
		}
	}
	
	printf("<-- Ultimo termo!");
	
	return 0;
	
}
