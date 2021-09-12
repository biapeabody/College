#include <stdio.h>
#include <stdlib.h>
#include <string.h>

float cofprevalencia(float x,float y ,float z);
float cofincidencia(float x,float y ,float z);
float letal(float x,float y ,float z);
float mort_prorpocional(float x,float y ,float z);
 int main(void){
 	
 	float coeficiente_de_incidencia,coeficiente_de_prevalencia,letalidade,mortalidade_proporcional;
 	
 	coeficiente_de_prevalencia = cofprevalencia(0,0,0);
 	coeficiente_de_incidencia = cofincidencia(0,0,0);
 	letalidade = letal(0,0,0);
 	mortalidade_proporcional = mort_prorpocional(0,0,0);
 	//falta fazer uma função 
 	
 	printf("COEFICIENTE DE PREVALENCIA %0.2f \n",coeficiente_de_prevalencia);
 	printf("COEFICIENTE DE INCIDENCIA %0.2f \n",coeficiente_de_incidencia);
 	printf("TAXA DE LETALIDADE  %0.2f \n ",letalidade);
 	printf("MORTALIDADE PROPORCIONAL %0.2f\n",mortalidade_proporcional);
 	
 	
 	
 	
 	return 0;
 }
float cofprevalencia(float x,float y,float z ){
	float poptot,casos,taxa;
	printf("informe o numero da polulação : ");
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

