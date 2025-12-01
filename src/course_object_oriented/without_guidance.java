package course_object_oriented;

import java.util.Scanner;
import java.util.Locale;

public class without_guidance {

	public static void main(String[] args) {
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measure of triangle x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measure of triangle y: ");
		yA= sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC ) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p- yB) * (p- yC));
		
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
