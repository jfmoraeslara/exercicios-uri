package uri_java;

import java.util.Locale;
import java.util.Scanner;

public class uri_1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		int velocidade = sc.nextInt();
		
		double litro = ((double)tempo * (double)velocidade) / 12;
		
		System.out.printf("%.3f%n", litro);		
					
		sc.close();
	}
}