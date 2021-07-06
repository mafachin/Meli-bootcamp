package Projetos.Java_Aula_3_TT;

import Projetos.Java_Aula_3_TT.Armas.*;
import static java.lang.System.out;

public class Personagem {
    private String nome;
    private PersonagemClasse classe;
    private int nivel;
    private Arma arma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PersonagemClasse getClasse() {
        return classe;
    }

    public void setClasse(PersonagemClasse classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Personagem() {}

    public Personagem(String nome, PersonagemClasse classe, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
    }

    public void ataqueNormal () {
        out.println("Atacando com a arma " + this.arma.getNome());

        this.arma.atacar();
    }

    public void ataqueEspecial () {
        if (this.arma instanceof Arco)
            ((Arco) this.arma).ataqueDistancia(this);
        else if (this.arma instanceof Cetro)
            ((Cetro) this.arma).ataqueMagico(this);
        else
            this.arma.atacar();
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\nClasse: %s\nNivel: %s\nArma equipada: %s\nDano: %.1f\n",
                this.nome,
                this.classe.toString(),
                this.nivel,
                this.arma.getNome(),
                this.arma.getDanoBasico()
        );
    }
}