package br.com.trinks.app;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] caledario = {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO",
                "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};

            System.out.println("Informe o número do mês? 1/12");
            byte opcao = entrada.nextByte();

            if (opcao <= 12 && opcao > 0){
                System.out.println(caledario[opcao - 1]);
            } else {
            System.out.println("Opção invalida!");
            }
        }
}
