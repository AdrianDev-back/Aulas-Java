package curso.Java.Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Funcões_Matematicas {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Squere root of " + x + " = " + A);
		System.out.println("Squere root of " + y + " = " + B);
		System.out.println("Squere root of 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " Raised to the power of " + y + " = " + A);
		System.out.println(x + " Squered = " + B);
		System.out.println("5 squered = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Absolute value of " + y + " = " + A);
		System.out.println("Absolute value of " + z + " = " + B);
		
		
		
		
		
	 sc.close();
	}

}
