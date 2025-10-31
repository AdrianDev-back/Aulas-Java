package curso.Java.Udemy;

import java.util.Locale;
import java.util.Scanner;

public class fixação7 {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
		// mostre:  
			//a) a área do triângulo retângulo que tem A por base e C por altura.  
			//b) a área do círculo de raio C. (pi = 3.14159)  
			//c) a área do trapézio que tem A e B por bases e C por altura.  
			//d) a área do quadrado que tem lado B.  
			//e) a área do retângulo que tem lados A e B.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi, triangle, circle, trapezoid, square, rectangle;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		triangle = A * C / 2.0;
		circle = pi * Math.pow(C, 2.0);
		trapezoid = (A + B) * C / 2.0;
		square = Math.pow(B, 2.0);
		rectangle = A * B;
		
		
		System.out.println("TRIANGLE = " + String.format("%.3f", triangle));
		System.out.println("CIRCLE = " +  String.format("%.3f", circle));
        System.out.println("TRAPEZOID = " + String.format("%.3f", trapezoid));
        System.out.println("SQUARE = " + String.format("%.3f", square));
        System.out.println("RECTANGLE = " + String.format("%.3f", rectangle));
        System.out.println("RECTANGLE = " + String.format("%.3f", rectangle));
		
		
		
		
		
	 sc.close();
	 }

}
