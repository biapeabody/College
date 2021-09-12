for(idx=0; idx<n_sint; idx++){
		printf("O sintoma %i foi: %s\n", idx+1, sintomas[idx]);
	}
	
	
	
	
	for(idx=0; idx<Linhas; idx++){
		if(strcmp(parar, Matriz[idx])!=0){
			printf("O local %i° de maior incidência é: %s\n", idx+1, Matriz[idx]);
		}
		else if(strcmp(parar, Matriz[idx])==0){
			break;
		}
	}
