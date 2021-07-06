package Aula_3_Lista_1;
import java.util.Scanner;

public class Exercicio_2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int aux = 0 ;
		int count = 0 ;

		System.out.printf("Informe quantos valores quer mostrar: ");
	  	int n = ler.nextInt(); 
	  	System.out.printf("Informe qual multiplo que mostrar: ");
	  	int m = ler.nextInt(); 
	  		    
	  	while(count!=n){
	    	aux++;
	    	if(aux%m==0){
	    	    System.out.printf("%d\n", aux);
	    	    
	    	    count++;
	    	}
	    }

	}

}
