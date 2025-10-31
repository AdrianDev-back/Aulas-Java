package curso.Java.Udemy;

import java.util.Locale;
import java.util.Scanner;

public class fixação6 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qte1, qte2, TP;
		double value1, value2, total;
		
		cod1 = sc.nextInt(); 
		qte1 = sc.nextInt();
		value1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qte2 = sc.nextInt();
		value2 = sc.nextDouble();
		total = qte1 * value1 + qte2 * value2;
		
		
		System.out.printf("Amount to pay = R$%.2f ", total);
		
		
		
		
		
     
		
	 sc.close();
	}

}
