#include<stdio.h>
char pergunta1(char resposta,char a,char b,char c,char d,int ponto1=0){
	printf("Qual a frase dita na proclamacao da republica? \n\n");
	printf("A = Independencia ou morte!\n");
	printf("B = Morte ou independencia!\n");
	printf("C = Brasil acima de tudo, Deus acima de todos!\n");
	printf("D = Independencia na morte!\n\n");
	printf("Resposta: ");
	scanf("%c",&resposta);
	fflush(stdin);
	if(resposta == 'a'){
		printf("CORRETO!!!\n");
		ponto1=20;
		printf("+ 20 PONTOS!!!\n\n");
    }    
    else if(resposta == 'c'){
    	printf
		("VOCE E UM RETARDADO!!!\n\n");
    	
	}
	else{
		printf("ERRADO!!!\n\n");
		ponto1=0;
	}
	return ponto1;
}

char pergunta2(char resposta,char a,char b,char c,char d,int ponto2=0){
	printf("Qual a data do fim da 2 guerra mundial? \n\n");
	printf("A = 1800\n");
	printf("B = 1950\n");
	printf("C = 1945\n");
	printf("D = 1940\n\n");
	printf("Resposta: ");
	scanf("%c",&resposta);
	fflush(stdin);
	if(resposta == 'c'){
		printf("CORRETO!!!\n");
		ponto2=20;
		printf("+ 20 PONTOS!!!\n\n");
    }
	else{
		printf("ERRADO!!!\n\n");
		ponto2=0;
	}
	return ponto2;
}

char pergunta3(char resposta,char a,char b,char c,char d,int ponto3=0){
	printf("Qual a cor do cavalo branco de napoleao? \n\n");
	printf("A = Verde\n");
	printf("B = Rosa XOCK\n");
	printf("C = Rosa Pink\n");
	printf("D = Branco!\n\n");
	printf("Resposta: ");
	scanf("%c",&resposta);
	fflush(stdin);
	if(resposta == 'd'){
		printf("CORRETO!!!\n");
		ponto3=20;
		printf("+ 20 PONTOS!!!\n\n");
    }
	else{
		printf("ERRADO!!!\n\n");
		ponto3=0;
	}
    return ponto3;
}

char pergunta4(char resposta,char a,char b,char c,char d,int ponto4=0){
	printf("Qual a data de comemoracao do aniversario de Gravata? \n\n");
	printf("A = 15/03\n");
	printf("B = 15/04\n");
	printf("C = 15/05\n");
	printf("D = 15/02\n\n");
	printf("Resposta: ");
	scanf("%c",&resposta);
	fflush(stdin);
	if(resposta == 'a'){
		printf("CORRETO!!!\n");
		ponto4=20;
		printf("+ 20 PONTOS!!!\n\n");
    }
	else{
	    printf("ERRADO!!!\n\n");
	    ponto4=0;
	}
	return ponto4;
}

char pergunta5(char resposta,char a,char b,char c,char d,int ponto5=0){
	printf("Qual destes personagens e o mais forte? \n\n");
	printf("A = Goku\n");
	printf("B = Naruto\n");
	printf("C = Aang\n");
	printf("D = Midorya\n\n");
	printf("Resposta: ");
	scanf("%c",&resposta);
	fflush(stdin);
	if(resposta == 'c'){
		printf("CORRETO!!!\n");
		ponto5=20;
		printf("+ 20 PONTOS!!!\n\n");
    }
	else{
		printf("ERRADO!!!\n\n");
		ponto5=0;
	}
	return ponto5;
}

void orde(int v[],int TAMANHO){
	int j, k, auxi;
	
	for(j=0 ; j<TAMANHO ; j++){
		for(k=0 ; k<TAMANHO ; k++){
			if(v[k]<v[k+1]){
				auxi=v[k];
				v[k]=v[k+1];
				v[k+1]=auxi;
			}
		}
	}
	for(j=0 ; j<TAMANHO ; j++){
		printf("%i\n",v[j]);
    }
}

int main(){
	void orde(int v[],int tamanho);
	char resposta,a,b,c,d;
	int ponto1, ponto2, ponto3, ponto4, ponto5;
	int cont,pontot, TAMANHO=6;
	int v[TAMANHO];
	
	
	for(cont=0 ; cont<TAMANHO ; cont++){
		char primeira = pergunta1(resposta,a,b,c,d,ponto1);
		char segunda = pergunta2(resposta,a,b,c,d,ponto2);
		char terceira = pergunta3(resposta,a,b,c,d,ponto3);
		char quarta = pergunta4(resposta,a,b,c,d,ponto4);
		char quinta = pergunta5(resposta,a,b,c,d,ponto5);
		pontot=primeira+segunda+terceira+quarta+quinta;
		v[cont]=pontot;
		printf("Sua pontuacao e: %i\n\n\n",pontot);
	}
	
	orde(v,TAMANHO);
	
	return 0;
	
}
