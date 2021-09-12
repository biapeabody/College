#include<stdio.h>

main(){
	
	int piloto[6], pontuacao[6], cont, primeiro, segundo, terceiro;
	
	for(cont=0 ; cont<6 ; cont++){
		printf("\nDigite o numero do piloto: ");
		scanf("%i",&piloto[cont]);
		printf("Digite a pontuacao do piloto: ");
		scanf("%i",&pontuacao[cont]);
    }

	for(cont=0 ; cont<6 ; cont++){
		printf("\nPiloto:%i ",piloto[cont]);
		printf("Pontuacao:%i\n\n",pontuacao[cont]);
	}
	
	for(cont=0 ; cont<1 ; cont++){
		printf("O primeiro colocado e: %i\n",primeiro);
		printf("O segundo colocado e: %i\n",segundo);
		printf("O terceiro colocado e: %i",terceiro);
	}
	
	return 0;
	
}
