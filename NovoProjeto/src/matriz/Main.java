package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da matriz: ");
        int size = sc.nextInt(); // lendo tamanho maximo da matriz

        int[][] matriz = new int[size][size]; // declarando matriz
        int count = 0;
        // lendo valores iniciais da matriz
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                System.out.print("Informe o numero da posição " + i + " x " + k + ": ");
                matriz[i][k] = sc.nextInt();
                if (matriz[i][k] < 0) {
                    count++;
                }
            }
        }

        // mostrando matriz na tela
        System.out.println();
        System.out.println("Matriz informada");
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.print(matriz[i][k] + " ");
            }
            System.out.println();
        }

        // mostrando diagonal principal
        System.out.println();
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < size; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // mostrando diagonal secundaria
        System.out.println();
        System.out.print("Diagonal secundária: ");
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz.length - 1; j >= 0; j--) {
                if (i + j == matriz.length - 1) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        // mostrando quantidade de numeros negativos
        System.out.println();
        System.out.println("Quantidade de numeros negativos: " + count);

        sc.close();
    }
}