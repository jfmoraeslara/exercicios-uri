package uri_java;

import java.util.Locale;
import java.util.Scanner;

public class uri_1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, volume;
		raio = sc.nextDouble();
		volume = (4.0 / 3.0) * 3.14159 * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
	}
}