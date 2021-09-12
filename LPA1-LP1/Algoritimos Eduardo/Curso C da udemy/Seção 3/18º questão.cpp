#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
	float vol, l;
	
	printf("OBS.: O volume e em M cubicos!\n");
	printf("Digite o volume: ");
	scanf("%f",&vol);
	
	l = 1000 * vol;
	
	printf("O volume em litros e: %f",l);
	
	return 0;
}
