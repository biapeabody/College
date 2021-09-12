#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int loginsenha(){
	int i;
	char login[100];
	char senha[100];
	
	char senhacorreta[]="dudu@123456";
	char logincorreto[]="duduchaos20";
	
	//for(i=0 ; i<1 ; i++){
	printf("Digite seu login : ");
	gets(login);
	
	while(strcmp(login,logincorreto)!=0){
		printf("LOGIN INCORRETO!!!\n\nDigite novamente : ");
	    gets(login);
	}
	
	printf("Digite sua senha : ");
	gets(senha);
	
    while(strcmp(senha,senhacorreta)!=0){
	    printf("SENHA INCORRETA!!!\n\nDigite novamente : ");
	    gets(senha);
    }
	
	printf("\n");
    printf("Login e Senha validos.");
    printf("\n\n");
    //}
	
	printf("O tamanho do login e: %i", strlen(login));
	
	return i;
	
}

main(){
	
	loginsenha();
	
}
