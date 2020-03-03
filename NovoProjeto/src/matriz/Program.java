package matriz;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas: ");
        int m = sc.nextInt();
        System.out.print("Informe a quantidade de linhas: ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n]; // instanciando tamanho da matriz

        // lendo valores da matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Informe o numero da posição " + i + " x " + j + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println(" --------------------------------------- ");
        // mostrando matriz informada
        System.out.println("Matriz informada");
        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat[i].length; k++) {
                System.out.print(mat[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" --------------------------------------- ");
        // numero desejado pelo usuário
        System.out.print("Informe o numero desejado: ");
        int x = sc.nextInt();
        // mostrando informações relacionadas ao numero
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}