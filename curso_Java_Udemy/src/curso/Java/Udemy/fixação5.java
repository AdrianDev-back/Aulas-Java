package curso.Java.Udemy;

import java.util.Scanner;
import java.util.Locale;

public class fixação5 {

	public static void main(String[] args) {
		
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
		//decimais. 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, H;
		double HR, salary;
		
		number = sc.nextInt();
		H = sc.nextInt();
		HR = sc.nextDouble();
		salary = H * HR;
		
		System.out.println("Number = " + number);
		System.out.println("Salary = U$" + String.format("%.2f", salary));
		
		
		
		

    
     sc.close();
	}

}
