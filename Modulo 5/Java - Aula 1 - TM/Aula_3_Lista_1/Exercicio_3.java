package Aula_3_Lista_1;
import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe o valor que deseja verificar se é primo: ");
	  	int n = ler.nextInt(); 
	  	
	  	int count = 0;
		for(int j = 2; j <= n; j++){
	        if(n%j==0){
	        	count++;
	        } 
	  	}
		
		if(count==1 || n ==1) {
			System.out.printf("%d é primo", n);
		} else {
			System.out.printf("%d não é primo", n);

		}
		
	}

}
