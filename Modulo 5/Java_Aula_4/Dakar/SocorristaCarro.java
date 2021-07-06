package Projetos.Java_Aula_4.Dakar;

public class SocorristaCarro extends Carros{
    public void socorrer(Carros carro) {
        System.out.println("Socorrendo carro " + carro.getPlaca());
    }
}