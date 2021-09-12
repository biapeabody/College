#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

int main (int argc, char *argv[]){

	setlocale(LC_ALL,"Portuguese");
	
	char matriz[20];
	int idx;
	
	for( idx=0; idx<=20; idx++){
		
		printf("Digite o %i° locais de maior incidência: ", idx+1);
		gets(matriz);
		
		if (strcmp(matriz, "parar")==0){return 0;}else{}
			
	}
}
