#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

void parte1(){
	
	//todas as variáveis usadas
	int comparacao, comparacao2;
	char nomedoenca[50];
	char agente[50];
	char ativacao[20]; 
	char transmissor1[]="vetor";
	char transmissor2[]="etiologico";
	char vetor[20];
	
	//pergunta do nome
	printf("Digite o nome da doenca: ");
	gets(nomedoenca);
	printf("\n");
	
	//pergunta d tipo e qual o tipo
	printf("OBS.:Digite vetor ou etiologico!\n");
	printf("A doenca e transmitida por vetores ou agente etiologicos : ");
	gets(ativacao);
	printf("\n");
	comparacao=strcmp(ativacao,transmissor1);
    if(comparacao==0){
    	printf("Qual desses se assemelha mais ao Vetor: \nA)Mamiferos\nB)Aves\nC)Peixes\nD)Insetos\nResposta:");
    	gets(vetor);
    	printf("\n");
	}
    else if(comparacao!=0){
		printf("Qual desses se assemelha mais ao agente etiologico: \nA)Artropodes\nB)Metazoarios\nC)Protozoarios\nD)Fungos\nE)Micoplasmas\nF)Clamidias\nG)Rickettsias\nH)Bacterias\nI)Virus\nJ)Prions\nResposta: ");
		gets(vetor);
		printf("\n");
	}
     
    char localizacao[20];
	
	printf("Qual o tipo da sua localizacao: \nA)Sitio\nB)Cidade\nC)Campo\nD)Ilha\nResposta: ");
	gets(localizacao); 
     
}

int sintomas(){
	
	
	setlocale(LC_ALL, "Portuguese");
	
	int n_sint, idx;
	char sintomas[50][20];
	
	printf("Informe o número de sintomas: ");
	scanf("%i", &n_sint);
	fflush(stdin);
	printf("\n");
	
	for(idx=0; idx<n_sint; idx++){
		printf("Diga qual o sintoma %i: ", idx+1);
		gets(sintomas[idx]);
	}
	
	printf("\n");
	
}

int locais(){
	
	setlocale(LC_ALL, "Portuguese");
	
	int idx, Linhas=15;
	char Matriz[Linhas][50], parar[6]="parar";
	
	printf("OBS.:Para parar digite :parar\n");
	
	for(idx=0; idx<Linhas; idx++){
		printf("Digite o %i° local de maior incidência: ", idx+1);
		gets(Matriz[idx]);
		
		if(strcmp(parar, Matriz[idx])==0){
			break;
		}	
	}
	
}

float cofprevalencia(float x,float y ,float z);
float cofincidencia(float x,float y ,float z);
float letal(float x,float y ,float z);
float mort_prorpocional(float x,float y ,float z);

main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	parte1();
	printf("\n");	
	sintomas();
	printf("\n");
	locais();
	printf("\n");
	
	float coeficiente_de_incidencia,coeficiente_de_prevalencia,letalidade,mortalidade_proporcional;
 	
 	coeficiente_de_prevalencia = cofprevalencia(0,0,0);
 	coeficiente_de_incidencia = cofincidencia(0,0,0);
 	letalidade = letal(0,0,0);
 	mortalidade_proporcional = mort_prorpocional(0,0,0);
 	 
 	
 	printf("\nCOEFICIENTE DE PREVALENCIA %0.2f \n",coeficiente_de_prevalencia);
 	printf("COEFICIENTE DE INCIDENCIA %0.2f \n",coeficiente_de_incidencia);
 	printf("TAXA DE LETALIDADE  %0.2f \n",letalidade);
 	printf("MORTALIDADE PROPORCIONAL %0.2f\n",mortalidade_proporcional);
 	
 	return 0;
	
}

float cofprevalencia(float x,float y,float z ){
	float poptot,casos,taxa;
	printf("informe o numero da polulacao : ");
	scanf("%f",&poptot);
	printf("informe o numero de mortes : ");
	scanf("%f",&casos);
	taxa = casos/poptot;
	return taxa;

}
float cofincidencia(float x,float y,float z ){
	float pop_risco,casos_novos,taxa;
	printf("informe o numero da polulação em risco : ");
	scanf("%f",&pop_risco);
	printf("informe o numero de casos novos : ");
	scanf("%f",&casos_novos);
	taxa = casos_novos/pop_risco;
	return taxa;

}
float letal(float x,float y ,float z){
	float mortes,doentes,taxa;
	printf("numero de morte pela doenca x(NMDDP) : ");
	scanf("%f",&mortes);
	printf("informe o de emfermos atualmente : ");
	scanf("%f",&doentes);
	taxa = (mortes/doentes)*100;
	return taxa;

}
float mort_prorpocional(float x,float y ,float z){
	float mortes_por_doeca,morte,taxa;
	printf("mortes por doenças : ");
	scanf("%f",&mortes_por_doeca);
	printf("total de mortes no periodo: ");
	scanf("%f",&morte );
	taxa =  mortes_por_doeca/morte;
	return taxa;

}
