#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>

char cadastro(char id[20], char senha[20]){
	printf("Digite sua login para cadastro: ");
	for(int i=0 ; i<20 ; i++){
		id[i] = getche();
		if(id[i]=='%'){
			break;
		}
	}
	
	int ide = strlen(id);
	
	printf("\n\nDigite a senha: ");
	senha:for(int i=0 ; i<20 ; i++){
		senha[i] = getch();
		if(senha[i]=='%'){
			break;
		}
	}
	
	int sen = strlen(senha);
	
	printf("\n");
	
	printf("\nSeu login e: ");
	for(int i=0 ; i<ide-2 ; i++){
		printf("%c",id[i]);
	}
	
	printf("\n\nSua senha e: ");
	for(int i=0 ; i<sen-1 ; i++){
		printf("%c",senha[i]);
	}

}

int main(){
	int escolha, idade;
	char id[20], senha[20];
	
	printf("**************************************************************************\n");
	printf("BANCO DA UPE!\nEscolha uma das opcoes abaixo:\n\n1- Cadastrar\t2- Pesquisar\t3- Listar\t4- Sair");
	printf("\n**************************************************************************");
	printf("\nDigite a opcao: ");
	scanf("%d",&escolha);
	
	if(escolha==1){
		cadastro(char id[20], char senha[20]);
	}
	
	return 0;
}
