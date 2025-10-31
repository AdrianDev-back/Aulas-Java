package curso.Java.Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados_pt1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.print("Insert a name: ");
		
		String x;
		int y;
		double s;
		char f;
		
		x = sc.next();
		System.out.println("You typed: " + x);
		
		System.out.print("Type a number: ");
		y = sc.nextInt();
		System.out.println("You typed: " + y);
		
		System.out.print("Insert a number with decimal places: ");
		s = sc.nextDouble();
		System.out.println("You inserted: " + s);
		
		System.out.println("Insert a letter: ");
		f = sc.next().charAt(0);
		System.out.println("You inserted: " + f);
		
		
		
      sc.close();
	}

}
