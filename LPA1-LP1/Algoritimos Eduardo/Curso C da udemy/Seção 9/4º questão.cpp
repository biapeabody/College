//diz se um numero é quadrado perfeito ou não
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
#include<math.h>

void quadrado_perf(int x);

int main(){
	setlocale(LC_ALL,"Portuguese");
	int num;
	
	printf("Digite um número para saber se é quadrado perfeito ou não: ");
	scanf("%d",&num);
	
	if(num==1){
		printf("\nO numero é um quadrado perfeito!");
		return 0;
	}
	
	quadrado_perf(num);
	
	return 0;
}

void quadrado_perf(int x){
	int i = sqrt(x);
	if(i)
}
