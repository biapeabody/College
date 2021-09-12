#include<stdio.h>

main(){
	
	int a,b,c,cont,result;
	
	cont=0;
	
	printf("digite o primeiro valor: \n");
	scanf("%i",&a);
	
	printf("digite o segundo valor: \n");
	scanf("%i",&b);
	
	printf("digite o terceiro valor: \n");
	scanf("%i",&c);
	
	result=a+b-c;
	
	while(result < 100){
		printf("%i",++result);
	}
	
}
