package app;

import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {
        int exercicio1 = 0;
        exercicio1 = exercicio1();
        System.out.println("SOMA = " + exercicio1);

    }

    public static int exercicio1() {
        int num1 = 0;
        int num2 = 0;

        Scanner read = new Scanner(System.in);

        // lendo inteiros
        num1 = read.nextInt();
        read.nextLine(); // limpando buffer

        // lendo num2
        num2 = read.nextInt();
        read.nextLine();// limpando buffer

        int sum = num1 + num2; // faz o calculo

        read.close(); // fecha leitura
        return sum; // retorna o valor
    }

}