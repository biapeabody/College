#include<stdio.h>
#include<stdlib.h>

int main(){
	float base_menor, base_maior, altura, trapezio;
	
	printf("As medidas estao em metros!!!\n\n");
	printf("Digite os valores requisitados e descubra a area do trapezio!!!\n\n");
	printf("Digite a altura: ");
	scanf("%f",&altura);
	
	printf("Digite a base maior: ");
	scanf("%f",&base_maior);
	
	printf("Digite a base menor: ");
	scanf("%f",&base_menor);
	
	trapezio = ((base_menor + base_maior) * altura) / 2;
	
	printf("A area do trapezio e: %.3fm.",trapezio);
	
	return 0;
}
