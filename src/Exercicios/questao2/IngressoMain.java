package Exercicios.questao2;

import java.util.Scanner;

public class IngressoMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do ingresso:");
        Ingresso ingresso = new Ingresso(teclado.nextDouble());
        System.out.print(ingresso);
        IngressoVip ingressoVip = new IngressoVip(ingresso.getValor(), teclado.nextDouble());
        System.out.println("Digite o valor do ingressoVip:");
        ingressoVip.setValorAdiconal(teclado.nextDouble());
        System.out.println(ingressoVip);


    }
}
