package Projetos.Java_Aula_4.laChiqui;

public abstract class Convidado {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Convidado() {}

    public Convidado(String nome) {
        this.nome = nome;
    }

    public void comerBolo() {
        System.out.println(this.nome + " esta comendo bolo!");
    }
}