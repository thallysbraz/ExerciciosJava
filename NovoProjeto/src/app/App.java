package app;

import java.util.Locale;
import java.util.Scanner;
import util.*;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Entre com preço do dolar:");
        double dolarValue = read.nextDouble();
        System.out.print("Entre com o valor em dolares:");
        double dolarQuantity = read.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrentyValue.valor(dolarValue, dolarQuantity));

        read.close();
    }
}