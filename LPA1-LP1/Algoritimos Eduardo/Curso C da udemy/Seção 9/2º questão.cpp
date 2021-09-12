//diz a data colocada
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>

void data();

int main(){
	setlocale(LC_ALL, "Portuguese");
	
	data();
	
	return 0;
}

void data(){
	int dia, mes, ano;
	
	printf("Digite uma data: ");
	scanf("%d/%d/%d", &dia, &mes, &ano);
	if(mes == 1){
		printf("\nA data é %d de janeiro de %d",dia, ano);;
	}else if(mes == 2){
		printf("\nA data é %d de fevereiro de %d",dia, ano);
	}else if(mes == 3){
		printf("\nA data é %d de março de %d",dia, ano);
	}else if(mes == 4){
		printf("\nA data é %d de abril de %d",dia, ano);
	}else if(mes == 5){
		printf("\nA data é %d de maio de %d",dia, ano);
	}else if(mes == 6){
		printf("\nA data é %d de junho de %d",dia, ano);
	}else if(mes == 7){
		printf("\nA data é %d de julho de %d",dia, ano);
	}else if(mes == 8){
		printf("\nA data é %d de agosto de %d",dia, ano);
	}else if(mes == 9){
		printf("\nA data é %d de setembro de %d",dia, ano);
	}else if(mes == 10){
		printf("\nA data é %d de outubro de %d",dia, ano);
	}else if(mes == 11){
		printf("\nA data é %d de novembro de %d",dia, ano);
	}else{
		printf("\nA data é %d de dezembro de %d",dia, ano);
	}
}
