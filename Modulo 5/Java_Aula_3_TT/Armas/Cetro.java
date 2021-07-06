package Projetos.Java_Aula_3_TT.Armas;

import Projetos.Java_Aula_3_TT.PersonagemClasse;
import Projetos.Java_Aula_3_TT.Personagem;

import static java.lang.System.out;

public class Cetro extends Arma {
    private double danoMagico;

    public double getDanoMagico() {
        return danoMagico;
    }

    public void setDanoMagico(double danoMagico) {
        this.danoMagico = danoMagico;
    }

    public Cetro(String nome, RaridadeArma raridade, double danoBasico, double danoMagico) {
        super(nome, raridade, danoBasico);
        this.danoMagico = danoMagico;
    }

    public void ataqueMagico(Personagem p) {
        double multiplicador = p.getClasse() == PersonagemClasse.MAGO ? 1.5 : 1;

        out.println("Ataque magico: Dano " + danoMagico * multiplicador);
    }
}