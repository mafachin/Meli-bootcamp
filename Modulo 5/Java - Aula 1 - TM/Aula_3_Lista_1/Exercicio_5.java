package Aula_3_Lista_1;
import java.util.Scanner;

public class Exercicio_5 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		int aux = 0;
        int count = 0;
        int point = 0;
        
		System.out.printf("Informe quantos valores quer mostrar: ");
	  	int n = ler.nextInt(); 
	  	
	  	System.out.printf("Quantos digitos terá: ");
	  	int m = ler.nextInt(); 
	  	
	  	System.out.printf("Com qual valor: ");
	  	int d = ler.nextInt(); 
	  	
	  		    
	  	while(count!=n){
	  		String number = Integer.toString(aux);
	  		
	  		point = 0;
	  		
	  			for (int i = 0; i < number.length(); i++){
	  				char chr = number.charAt(i);
		  			 if( d == Character.getNumericValue(chr)) {
		  				 point++;
		  			 }
	            }
	  			if(m==point) {
	  				System.out.println(aux);
	  				count++;
	  			}
	  		aux++;
	    }
	}
}