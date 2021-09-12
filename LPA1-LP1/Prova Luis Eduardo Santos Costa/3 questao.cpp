#include<stdio.h>

main(){
	
    int alunos, alunosent, aluno20, n[2], refeicao[alunosent], cont, acimade20; //variável->n = maiores quantidades de refeições, variável->alunosent = Alunos Entrevistados

	printf("Quantos alunos foram entrevistados: \n");
	scanf("%i",&alunosent);
	
	printf("Alunos entrevistados: %i\n",alunosent);
	
	for(cont=0 ; cont<alunosent ; cont++){
		printf("Quantas refeicoes voce fez no mes passado: \n");
		scanf("%i",&refeicao[cont]);
	}
	
	for(cont=0 ; cont<alunosent ; cont++){
		if(refeicao[cont]>=20){
			printf("%i ",refeicao[cont]);
		}
	}
	
	printf("<--- Refeicoes acima de 20\n");
	
	for(cont=1 ; cont>=0 ; cont--){
		if(refeicao[cont]<refeicao[cont]){
			n[cont]=refeicao[cont];
		}
		printf("%i ",n[cont]);
	}
	
	printf("<--- N maiores quantidades de refeicoes!");
	
	return 0;
	
}
