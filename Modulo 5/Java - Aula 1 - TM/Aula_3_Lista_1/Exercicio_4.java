package Aula_3_Lista_1;
import java.util.Scanner;

public class Exercicio_4 {
	
	public static boolean primo(int number) {
	  	int count = 0;
		for(int j = 2; j <= number; j++){
	        if(number%j==0){
	        	count++;
	        } 
	  	}
		
		if(count==1 || number ==1) {
			System.out.printf("%d\n", number);
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		int aux = 0 ;
		int count = 0 ;

		System.out.printf("Informe quantos valores quer mostrar: ");
	  	int n = ler.nextInt(); 
	  		    
	  	while(count!=n){
            aux++;

	  		if(primo(aux)) {
	  			count++;
	  		}

	    }

	}

}
