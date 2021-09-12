#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
#include<conio.h>

int main(int argc, char *argv[]){
	setlocale(LC_ALL,"Portuguese");

	int val1, val2, val3, val4;
	
	char sinal1, sinal2, sinal3;
	
	printf("As sinais de condição são\n ^ --> conjunção e\n U --> alternância ou\n O --> alternância de negação");
	
	printf("\n\n\nDigite a sentenças a serem analisadas: ");
	scanf("%d%c%d %c %d%c%d", &val1, &sinal1, &val2, &sinal2, &val3, &sinal3, &val4);
	//puts("\n\n");
	
	if(sinal2 == '^'){    							// Análises do sinal de conjunção
		if(sinal1 == '>' && sinal3 == '>'){
			if(val1>val2 && val3>val4){		//maior e maior
				printf("V ^ V = V");
			}else if(val1>val2 && val3<val4){
				printf("V ^ F = F");
			}else if(val1<val2){
				printf("F ^ V/F = F");
		 	}
		}else if(sinal1 == '>' && sinal3 == '<'){		//maior e menor
			if(val1>val2 && val3>val4){
				printf("V ^ F= F");
			}else if(val1>val2 && val3<val4){
				printf("V ^ V = V");
			}else if(val1<val2 && val3<val4){
				printf("F ^ V = F");
		 	}else{
		 		printf("F ^ F = F");
			 }
		}else if(sinal1 == '<' && sinal3 == '<'){		//menor e menor
			if(val1>val2 && val3>val4){
				printf("F ^ F= F");
			}else if(val1>val2 && val3<val4){
				printf("F ^ V = F");
			}else if(val1<val2 && val3<val4){
				printf("V ^ V = V");
		 	}else{
		 		printf("V ^ F = F");
			}
		}else{											//menor e maior
			if(val1>val2 && val3>val4){
				printf("F ^ V = F");
			}else if(val1>val2 && val3<val4){
				printf("F ^ F = F");
			}else if(val1<val2 && val3<val4){
				printf("V ^ F = F");
		 	}else{
		 		printf("V ^ V = V");
			}
		}
	}
	
	else if(sinal2 == 'U'){							// Análises do sinal de Alternância
		if(sinal1 == '>' && sinal3 == '>'){
			if(val1>val2 && val3>val4){		//maior e maior
				printf("V U V = V");
			}else if(val1>val2 && val3<val4){
				printf("V U F = V");
			}else if(val1<val2 && val3>val4){
				printf("F U V = V");
		 	}else{
		 		printf("F U F = F");
			 }
		}else if(sinal1 == '>' && sinal3 == '<'){		//maior e menor
			if(val1>val2 && val3>val4){
				printf("V U F= V");
			}else if(val1>val2 && val3<val4){
				printf("V U V = V");
			}else if(val1<val2 && val3<val4){
				printf("F U V = V");
		 	}else{
		 		printf("F U F = F");
			 }
		}else if(sinal1 == '<' && sinal3 == '<'){		//menor e menor
			if(val1>val2 && val3>val4){
				printf("F U F= F");
			}else if(val1>val2 && val3<val4){
				printf("F U V = V");
			}else if(val1<val2 && val3<val4){
				printf("V U V = V");
		 	}else{
		 		printf("V U F = V");
			}
		}else{											//menor e maior
			if(val1>val2 && val3>val4){
				printf("F U V = V");
			}else if(val1>val2 && val3<val4){
				printf("F U F = F");
			}else if(val1<val2 && val3<val4){
				printf("V U F = V");
		 	}else{
		 		printf("V U V = V");
			}
		}
	}
	
	else if(sinal2 == 'O'){							// Análises do sinal de Alternância exclusiva
		if(sinal1 == '>' && sinal3 == '>'){
			if(val1>val2 && val3>val4){		//maior e maior
				printf("V O V = F");
			}else if(val1>val2 && val3<val4){
				printf("V O F = V");
			}else if(val1<val2 && val3>val4){
				printf("F O V = V");
		 	}else{
		 		printf("F O F = F");
			 }
		
		}else if(sinal1 == '>' && sinal3 == '<'){		//maior e menor
			if(val1>val2 && val3>val4){
				printf("V O F = V");
			}else if(val1>val2 && val3<val4){
				printf("V O V = F");
			}else if(val1<val2 && val3<val4){
				printf("F O V = V");
		 	}else{
		 		printf("F O F = F");
			 }
		}else if(sinal1 == '<' && sinal3 == '<'){		//menor e menor
			if(val1>val2 && val3>val4){
				printf("F O F= F");
			}else if(val1>val2 && val3<val4){
				printf("F O V = V");
			}else if(val1<val2 && val3<val4){
				printf("V O V = F");
		 	}else{
		 		printf("V O F = V");
			}
		}else{											//menor e maior
			if(val1>val2 && val3>val4){
				printf("F O V = V");
			}else if(val1>val2 && val3<val4){
				printf("F O F = F");
			}else if(val1<val2 && val3<val4){
				printf("V O F = V");
		 	}else{
		 		printf("V O V = F");
			}
		}
	}
	
	else{
		printf("ERROR!!!");
	}
	
	return 0;
}
