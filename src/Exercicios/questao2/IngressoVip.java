package Exercicios.questao2;

import java.util.Scanner;

public class IngressoVip extends Ingresso {

    private double valorAdiconal;

    public IngressoVip(double valor, double valorAdiconal) {
        super(valor);
        this.valorAdiconal = valorAdiconal;
    }




    public double getValorAdiconal() {
        return valorAdiconal;
    }

    public void setValorAdiconal(double valorAdiconal) {
        this.valorAdiconal = valorAdiconal;
    }

    @Override
    public String toString() {
        return "O valor do IngressoVip é "+(valorAdiconal+getValor());
    }
}
