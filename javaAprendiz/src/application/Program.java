package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle(); //Iniciando X
		y = new Triangle(); //Iniciando Y
		
		//Lendo os valores de X
		System.out.println("Enter the measures of triangle X: ");
		x.a = read.nextDouble();
		x.b = read.nextDouble();
		x.c = read.nextDouble();
		
		//Lendo os valores de Y
		System.out.println("Enter the measures of triangle Y: ");
		y.a = read.nextDouble();
		y.b = read.nextDouble();
		y.c = read.nextDouble();
		
		//Calculando area de X
		double areaX = x.area();
		
		//Calculando area de Y
		double areaY = y.area();
		
		//Mostrando resultados na tela
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area X");
		}
		else {
			System.out.println("Larger area Y");
		}
		
		read.close();
	}
}
