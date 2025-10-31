package curso.Java.Udemy;

import java.util.Scanner;
import java.util.Locale;

public class fixação3 {

	public static void main(String[] args) {
		
		 
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
		//casas decimais conforme exemplos.  
		//Fórmula da área: area = π . raio2  
		//Considere o valor de π = 3.14159
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double raio, pi, area;
		
		pi =  3.14159;
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2.0);
		
		System.out.println("Area = " + String.format("%.4f", area));
		
		
		
		
		
		sc.close();
	}

}
