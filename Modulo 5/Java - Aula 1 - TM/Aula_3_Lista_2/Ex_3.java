package Aula_3_Lista_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Produto {
    private String name;
    private double valor;
    private int quantidade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setvalot(double price) {
        this.valor = price;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantity(int quantidade) {
        this.quantidade = quantidade;
    }

    Produto(String name, double valor, int quantidade) {
        this.name = name;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String toString() {
        return String.format("%s\nR$%.2f\nQuantidade: %d", this.getName(), this.getValor(), this.getQuantidade());
    }
}

public class Ex_3 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		int count = 1;
		double total = 0.0;

		
	  
	  	for(int i=0; i<3; i++) {
			System.out.printf("Informe qual produto voce quer comprar: ");
		  	String nome = ler.nextLine(); 
		  	
			System.out.printf("Informe o valor do produto: ");
		  	double valor = ler.nextDouble(); 
		  	
		  	
			System.out.printf("Informe a aquantidade: ");
		  	int quantidade = ler.nextInt(); 
		  	
		  	ler.nextLine();
		  	
		  	Produto compra = new Produto(nome, valor, quantidade);
		  	listaProduto.add(compra);
	  	}
		  	

	  	for(Produto p : listaProduto) {
	  		System.out.println(String.format("Produto %d", count));
	  		System.out.println(p.toString());
	  		System.out.println();
	  		
	  		total += (p.getValor() * p.getQuantidade());
	  		count++;


	  	}
	  		
	}
}
