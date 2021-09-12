#include<stdio.h>

int main(){
	
	float nota1, nota2, nota3, nota4, nota5, media;
	
	printf("digite a primeira nota: \n");
	scanf("%f", &nota1);
	
	printf("digite a segunda nota: \n");
	scanf("%f", &nota2);
	
    printf("digite a terceira nota: \n");
	scanf("%f", &nota3);
	
	printf("digite a quarta nota: \n");
	scanf("%f", &nota4);
	
	printf("digite a quinta nota: \n");
	scanf("%f", &nota5);
	
	media=((nota1+nota2+nota3+nota4+nota5)/5);
	
	printf("\nnota 1: %0.1f media geral: %0.1f",nota1 ,media);
	printf("\nnota 2: %0.1f media geral: %0.1f",nota2 ,media);
	printf("\nnota 3: %0.1f media geral: %0.1f",nota3 ,media);
	printf("\nnota 4: %0.1f media geral: %0.1f",nota4 ,media);
	printf("\nnota 5: %0.1f media geral: %0.1f\n\n",nota5 ,media);
	
	
	return 0;
	
}
