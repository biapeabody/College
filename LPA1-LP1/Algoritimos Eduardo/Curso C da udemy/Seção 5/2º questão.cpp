#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	int i, j=1, k=1;
	
	for(i = 1 ; i <= 100 ; i++){
		printf("%i, ",i);
	}
	
	printf("\n\n\n\n");
	
	while(j <= 100){
		printf("%i, ",j);
		j++;
	}
	
	printf("\n\n\n\n");
	
	do{
		printf("%i, ",k);
		k++;
	}while(k <= 100);
	
	return 0;
}
