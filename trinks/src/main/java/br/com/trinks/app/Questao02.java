package br.com.trinks.app;

import java.util.*;
import java.util.stream.Collectors;

public class Questao02 {

    public static void main(String[] args) {
        Map<String, Integer> listaBrasil = new HashMap<>();
        listaBrasil.put("Fernando de Noronha ", 10000);
        listaBrasil.put("Rio de Janeiro ", 2500);
        listaBrasil.put("Bonito ", 3500);
        listaBrasil.put("Chapada Diamantinha ", 8000);
        listaBrasil.put("Serras Gaúchas ", 5500);
        listaBrasil.put("Salvador ", 4000);
        listaBrasil.put("Natal ", 3500);
        listaBrasil.put("Amazônia ", 8500);
        listaBrasil.put("Búzios(RJ) ", 2800);
        listaBrasil.put("Brasília ", 4200);

        List<Integer> valores = listaBrasil.values().stream().collect(Collectors.toList());
        Collections.sort(valores);
        Collections.reverse(valores);
        List<Integer> maisCaros = valores.subList(0, 5);

        List<Map.Entry<String, Integer>> cidades = listaBrasil.entrySet().stream().filter(entry -> maisCaros.contains(entry.getValue())).collect(Collectors.toList());
        cidades.sort((o1, o2) -> o2.getValue() - o1.getValue());
        System.out.println("Lugares mais caros do Brasil:");
        cidades.subList(0, 5).forEach(System.out::println);

        Map<String, Integer> listaMundo = new HashMap<>();
        listaMundo.put("Buenos Aires ", 3000);
        listaMundo.put("Nova York ", 15000);
        listaMundo.put("Paris ", 8500);
        listaMundo.put("Tokio ", 12000);
        listaMundo.put("Cairo ", 7000);
        listaMundo.put("Casaclanca ", 6800);
        listaMundo.put("Vona Deli ", 8500);
        listaMundo.put("Ilha da Páscoa ", 11000);
        listaMundo.put("Havaí ", 8300);
        listaMundo.put("Qebec ", 7000);

        List<Integer> valoresMundo = listaMundo.values().stream().collect(Collectors.toList());
        Collections.sort(valoresMundo);
        List<Integer> maisBaratos = valoresMundo.subList(0, 5);

        List<Map.Entry<String, Integer>> cidadesMundo = listaMundo.entrySet().stream().filter(entry -> maisBaratos.contains(entry.getValue())).collect(Collectors.toList());
        cidadesMundo.sort((o1, o2) -> o2.getValue() - o1.getValue());
        System.out.println("\n===============================\n");
        System.out.println("Lugares mais baratos do Mundo:");
        cidadesMundo.subList(0, 5).forEach(System.out::println);
    }

}
