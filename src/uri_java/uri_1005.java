package uri_java;

import java.util.Locale;
import java.util.Scanner;

public class uri_1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double media = (A * 0.35 + B * 0.75) * 10 / 11;
		
		System.out.printf("MEDIA = %.5f%n", media);
			    	      
		sc.close(); 
    } 
}