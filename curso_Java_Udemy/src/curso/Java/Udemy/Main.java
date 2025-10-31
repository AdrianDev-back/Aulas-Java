package curso.Java.Udemy;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.456;
		double s = 12.425;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		
		System.out.println("Hello World!!!");
		System.out.println("FOR A BRIGHT FUTURE!!!");
		System.out.println(y);
		System.out.printf("%.2f\n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", s);
		System.out.printf("RESULT = " + x + " METERS\n");
		System.out.printf("RESULT = %.2f METERS\n", x);
		System.out.printf("%s is %d years old and earns R$%.2f real\n", nome, idade, renda);

	}

}
