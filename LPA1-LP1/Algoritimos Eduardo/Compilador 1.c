#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){

    char ini, fim, sinal1, sinal2, sinal3;
    int prim, prim1, soma1;
    int segund, segund1, soma2;
    int terc, terc1, soma3;
    char erro[] = "ERROR";

    scanf("%c",&ini);
    fflush(stdin);

    if(ini != '{'){
        printf("ERROR!!!");
        return 0;
    }
    //PRIMEIRA LINHA
    printf("\n\t");
    scanf("%d%c%d",&prim,&sinal1,&prim1);     //pega os dados em sequência
    fflush(stdin);
    
    if(sinal1 == '+'){
    	soma1 = prim + prim1;
	}else if(sinal1 == '-'){
		soma1 = prim - prim1;
	}else if(sinal1 == '*'){
		soma1 = prim * prim1;
	}else if(sinal1 == '/'){
		soma1 = prim / prim1;
	}

    //SEGUNDA LINHA
    printf("\n\t");
    scanf("%d%c%d",&segund,&sinal2,&segund1);     //pega os dados em sequência
    fflush(stdin);
    
    if(sinal2 == '+'){
    	soma2 = segund + segund1;
	}else if(sinal2 == '-'){
		soma2 = segund - segund1;
	}else if(sinal2 == '*'){
		soma2 = segund * segund1;
	}else if(sinal2 == '/'){
		soma2 = segund / segund1;
	}
    
	//TERCEIRA LINHA
    printf("\n\t");
    scanf("%d%c%d",&terc,&sinal3,&terc1);     //pega primeiro número
    fflush(stdin);
    
    if(sinal3 == '+'){
    	soma3 = terc + terc1;
	}else if(sinal3 == '-'){
		soma3 = terc - terc1;
	}else if(sinal3 == '*'){
		soma1 = terc * terc1;
	}else if(sinal3 == '/'){
		soma3 = terc / terc1;
	}

	printf("\n");

	scanf("%c",&fim);
	
    if(fim != '}'){
        printf("ERROR!!!");
        return 0;
    }
    
    printf("%d\n",soma1);
    printf("%d\n",soma2);
    printf("%d",soma3);

}
