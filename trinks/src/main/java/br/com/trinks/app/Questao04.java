package br.com.trinks.app;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Questao04 fat = new Questao04();
        System.out.print("Informe um número: ");
        Integer numero = entrada.nextInt();;
        System.out.println("O fatorial de " + numero + " é: " + fat.fatorial(numero));
    }
    public Integer fatorial(Integer i) {
        if (i == 0){
            return 1;
        }
        return i * fatorial(i - 1);
    }
}