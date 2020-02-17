package app;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com os dados do aluno:");
        System.out.print("Nome:");
        aluno.nome = read.nextLine();
        System.out.print("Nota 1:");
        aluno.nota1 = read.nextDouble();
        System.out.print("Nota 2:");
        aluno.nota2 = read.nextDouble();
        System.out.print("Nota 3:");
        aluno.nota3 = read.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", aluno.nota());
        if (aluno.nota() < 60.0) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f Points%n", aluno.result());
        } else {
            System.out.println("Pass");
        }

        read.close();
    }
}