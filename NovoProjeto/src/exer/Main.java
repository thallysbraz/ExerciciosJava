package exer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Thallys");
        list.add("Silva");
        list.add("Braz");
        list.add("Maria");
        list.add("Marco");
        list.add("Mariana");
        list.add("Joao");
        list.add("Pedro");
        list.add("Paula");
        list.add("Paulo");
        list.add("Pamela");
        list.add(3, "Programador");

        System.out.println("tamanho da lista: " + list.size());

        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("-------------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("tamanho da lista: " + list.size());

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("-------------------------------------------");

        System.out.println("Index of Braz: " + list.indexOf("Braz"));
        System.out.println("Index of Braz: " + list.indexOf("Engenharia"));

        System.out.println("-------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());
        System.out.println("tamanho da lista: " + result.size());

        for (String name : result) {
            System.out.println(name);
        }

        System.out.println("-------------------------------------------");
    }

}