package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
	 // Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
	// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		double divisor = 0;
		
		for (int i = 0; i < N; i++) {
	       Double x = sc.nextDouble();
	       Double y = sc.nextDouble();
	        
	       if (x == 0 || y == 0) {
	    	   System.out.println("Impossible to divide");
	       }
	       else {
	    	   divisor = x / y;
	       }
	       
	       System.out.println(String.format("%.1f", divisor));
	       
	   
		}
		
		sc.close();
	}

}
