package Aula_3_Lista_2;
public class Ex_2 {
	
public static void main(String[] args) {
		
		float empresaX = 1.13F;
		float empresaY = 18.4F;
		int ano = 2021;
		
		
		while(empresaX<empresaY) {
			float valorX = empresaX*1.48F;
			empresaX = empresaX+valorX;
			
			float valorY = empresaY*0.32F;
			empresaY = empresaY+valorY;
			
			ano++;
			System.out.printf("Empresa X - 01/01/%d - Valor da Empresa: %f m \n", ano, empresaX);
			System.out.printf("Empresa Y - 01/01/%d - Valor da Empresa: %f m \n", ano, empresaY);

		}

	}

}
