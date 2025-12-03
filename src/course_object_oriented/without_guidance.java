package course_object_oriented;

import java.util.Scanner;

import entities.Triangle;

import java.util.Locale;

public class without_guidance {

	public static void main(String[] args) {
		//Transformando um programa sem orientação para um programa com orientação a objeto
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measure of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measure of triangle y: ");
		y.a= sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c ) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p- y.b) * (p- y.c));
		
		System.out.printf("Triangle area: %.4f\n",areaX);
		System.out.printf("Triangle area: %.4f\n",areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
				
	    sc.close();
	}

}
