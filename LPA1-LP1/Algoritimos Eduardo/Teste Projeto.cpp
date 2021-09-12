#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void primeiraparte(){
	
	int opcao, opcao2;
	char nomedoenca[100];
	char agente[100];
	
	printf("Digite o nome da doenca: ");
	gets(nomedoenca);
	printf("\n");
	
	printf("INFORME A PROCEDENCIA DA DOENCA \n1)Bacteriana\n2)Viral\n3)Vermes\n4)Genetica\n---> ");
    scanf("%i",&opcao);
    printf("\n");
    
    printf("INFORME A CARACTERISTACA MORFOFOLÓGIA DA BACTERIA\n1)Cocos\n2)diplococos\n3)estreptococos\n4)bacilos\n5)esperilos\n--->");
     scanf("%i",&opcao2);
     printf("\n");
	
}

main(){
	
	primeiraparte();
	
}
