package curso.Java.Udemy;

import java.util.Locale;
import java.util.Scanner;

public class fixação4 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
		//de A e B pelo produto de C e D segundo a fórmula:
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, difference;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		difference = A * B - C * D;
		
		System.out.println("Difference = " + difference);
	
		
		
		sc.close();
	}

}
