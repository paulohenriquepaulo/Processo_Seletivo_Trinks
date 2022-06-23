package br.com.trinks.app;

import java.util.*;

public class Questao01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        Integer numero = 0;
        List<Integer> lista = new ArrayList<>();
        String opcao = "x";

        while (opcao.equalsIgnoreCase("x") && lista.size() <= 78) {
            numero = rand.nextInt(79) + 1;
            while (lista.contains(numero)) {
                numero = rand.nextInt(79) + 1;
            }
            lista.add(numero);
            Collections.sort(lista);
            System.out.println("Número sorteado: " + numero + "\nNúmeros sorteados: " + lista);
            System.out.println("\nAperte 'X' para sortea outro número ou qualquer outra tecla para finalizar");
            opcao = entrada.nextLine();
        }
        if (opcao.equalsIgnoreCase("x")) {
            System.out.println("TODOS OS NÚMEROS JÁ FORAM SORTEADOS");
        } else {
            System.out.println("FINALIZANDO PROGRAMA...");
        }
    }

}
