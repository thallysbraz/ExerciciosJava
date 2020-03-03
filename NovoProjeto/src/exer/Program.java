package exer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int count = sc.nextInt();

        // ler dados iniciais
        for (int i = 0; i < count; i++) {
            System.out.println();
            System.out.println("Pessoa #" + i + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            // add pessoa na lista de pessoas
            list.add(new Pessoa(id, name, salary));
        }

        System.out.println(); // print pra limpar a tela

        // fazendo calculo de porcentagem do salário
        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrement = sc.nextInt();

        // fazendo filtro na lista
        Pessoa pes = list.stream().filter(x -> x.getId() == idIncrement).findFirst().orElse(null);

        if (pes == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentagem = sc.nextDouble();
            pes.increaseSalary(percentagem);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Pessoa obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }
}