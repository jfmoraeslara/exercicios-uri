package uri_java;

import java.util.Locale;
import java.util.Scanner;

public class uri_1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia = sc.nextInt();
		double consumo = sc.nextDouble();
		
		double media = distancia / consumo;
		
		System.out.printf("%.3f km/l%n", media);
					
		sc.close();
	}
}