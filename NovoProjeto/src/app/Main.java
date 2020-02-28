package app;

import java.util.Locale;
import java.util.Scanner;
//import util.*;
import entities.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double initSaldo = 0.0;
        double balance = 0.0;
        Conta cont;

        System.out.println("Entre com os dados da conta");

        System.out.print("Enter account number: ");
        int numberConta = sc.nextInt();

        sc.nextLine(); // nextLine pra limpar o buffer

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char option = sc.next().charAt(0);

        sc.nextLine();

        if (option == 'y') {
            System.out.print("Enter initial deposit value: ");
            initSaldo = sc.nextDouble();
        }

        cont = new Conta(numberConta, name, initSaldo); // Iniciando conta

        // mostrando dados da conta
        print(cont.getNumberConta(), cont.getName(), cont.getSaldo());

        // adicionando saldo
        System.out.print("Enter a deposit value: ");
        balance = sc.nextDouble(); // lendo o valor do deposito
        cont.addSaldo(balance);
        print(cont.getNumberConta(), cont.getName(), cont.getSaldo());

        // removendo saldo
        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble(); // lendo valor do saque
        cont.removeSaldo(balance);
        print(cont.getNumberConta(), cont.getName(), cont.getSaldo());

        // finalizando programa
        sc.close();
    }

    public static void print(int number, String name, double saldo) {
        System.out.println();
        System.out.println("Updated account data: ");

        String teste = "numberConta: " + number + "\n" + "Name: " + name + "\n" + "Saldo Disponivel: "
                + String.format("%.2f", saldo);

        System.out.println(teste);
        System.out.println();
    }

}