package Aula_3_Lista_1;
import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		int aux = 0 ;
		int count = 0 ;

		System.out.printf("Informe quantos valores quer mostrar: ");
	  	int n = ler.nextInt(); 
	  		    
	  	while(count!=n){
	    	aux++;
	    	if(aux%2==0){
	    	    System.out.printf("%d\n", aux);
	    	    
	    	    count++;
	    	}
	    }

	}

}
