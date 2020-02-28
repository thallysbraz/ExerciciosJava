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

        Conta cont = new Conta(numberConta, name, initSaldo); // Iniciando conta

        // mostrando dados da conta
        System.out.println("numberConta: " + cont.getNumberConta());
        System.out.println("Name: " + cont.getName());
        System.out.println("Saldo: $" + cont.getSaldo());

        // adicionando saldo
        System.out.print("Enter a deposit value: ");
        double balance = sc.nextDouble();

        cont.addSaldo(balance);

        System.out.println("Updated account deposit data: ");
        System.out.println("numberConta: " + cont.getNumberConta());
        System.out.println("Name: " + cont.getName());
        System.out.println("Saldo: $" + cont.getSaldo());

        // removendo saldo
        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble();

        cont.removeSaldo(balance);

        System.out.println("Updated account withdraw data: ");
        System.out.println("numberConta: " + cont.getNumberConta());
        System.out.println("Name: " + cont.getName());
        System.out.println("Saldo: $" + cont.getSaldo());

        // finalizando programa

        sc.close();

    }

}