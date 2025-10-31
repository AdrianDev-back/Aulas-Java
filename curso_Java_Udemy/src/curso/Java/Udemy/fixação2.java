package curso.Java.Udemy;

import java.util.Scanner;
import java.util.Locale;

public class fixação2 {

	public static void main(String[] args) {
		
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
		//mensagem explicativa, conforme exemplos.
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		
		System.out.println("Sum = " + c);
		
      sc.close();
	}

}
