package Aula_3_Lista_2;
public class Ex_1 {
	
	public static void main(String[] args) {
		
		int[] valueDec = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
		int[] valueCre = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};


		for (int i = 1; i < valueDec.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (valueDec[i] > valueDec[j]) {
		            int temp = valueDec[i];
		            valueDec[i] = valueDec[j];
		            valueDec[j] = temp;
		        }
		    }
		}
		
		System.out.println("Array em ordem decrescente:");
		 
		for (int n : valueDec) {
			System.out.print(n + " ");
		}
		System.out.println();

		

		for (int i = 1; i < valueCre.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (valueCre[i] < valueCre[j]) {
		            int temp = valueCre[i];
		            valueCre[i] = valueCre[j];
		            valueCre[j] = temp;
		        }
		    }
		}
		
		System.out.println("Array em ordem crescente:");
		 
		for (int n : valueCre) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}
