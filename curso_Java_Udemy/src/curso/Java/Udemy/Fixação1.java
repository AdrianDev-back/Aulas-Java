package curso.Java.Udemy;

import java.util.Locale;

public class Fixação1 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 32;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $%.2f\n", product1, price1);
		System.out.println(product2 + ", which price is $" + String.format("%.2f", price2));
		System.out.println();
		
		System.out.printf("Record: %d years old, code %d and gender: %s\n", age, code, gender);
		System.out.println();
		
		System.out.println("Measure with eight decimal places: " + String.format("%.8f", measure));
		System.out.println("Rouded (three decimal places): " + String.format("%.3f", measure));
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n", measure);
		
		

	}

}
