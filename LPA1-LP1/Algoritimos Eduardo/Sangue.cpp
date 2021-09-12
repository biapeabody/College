#include<stdio.h>

main(){
	
	int idade, tempo;
	char tatoo, s;
	
	printf("digite sua idade: \n");
	scanf("%i",&idade);
	
	if(idade <= 17 || idade >= 68){
		printf("voce nao pode doar!");
	}
	
	if(idade >=18 || idade <= 67){
        printf("possui tatuagem: \n");
	    scanf("%c",&tatoo);
	    
	}

if(tatoo == s){
		    printf("digite s para sim e n para nao.");
		    printf("a quanto tempo foi feita: \n");
		    scanf("%i",&tempo);
	}
	
	
}
