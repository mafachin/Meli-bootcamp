package Projetos.Java_Aula_4.Dakar;

public class Carros extends Veiculo {
    public Carros() {
        this.setPeso(1000);
        this.setRodas(4);
    }

    public Carros(double aceleracao, double anguloDeGiro, String placa, double velocidade) {
        super(aceleracao, anguloDeGiro, placa, velocidade);
        this.setPeso(1000);
        this.setRodas(4);
    }
}