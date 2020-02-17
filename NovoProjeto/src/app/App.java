package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name:");
        product.name = read.nextLine();
        System.out.print("Price:");
        product.price = read.nextDouble();
        System.out.print("Quantity is stock:");
        product.quantity = read.nextInt();

        System.out.println("Name: " + product.name + ", Price: " + product.price + ", Quantity:  " + product.quantity);

        read.close();
    }
}