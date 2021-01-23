package uri_java;

import java.util.Locale;
import java.util.Scanner;

public class uri_1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		int valor = 0; // criado para corrigir a fração
		
		System.out.println("NOTAS:");
		valor = (int) x / 100;
		System.out.printf("%d nota(s) de R$ 100.00%n", valor);
		x = x % 100.0; // resto da divisão
		
		valor = (int)x / 50;
		System.out.printf("%d nota(s) de R$ 50.00%n", valor);
		x = x % 50.0;
		
		valor = (int) x / 20;
		System.out.printf("%d nota(s) de R$ 20.00%n", valor);
		x = x % 20.0;
		
		valor = (int) x / 10;
		System.out.printf("%d nota(s) de R$ 10.00%n", valor);
		x = x % 10.0;
		
		valor = (int) x / 5;
		System.out.printf("%d nota(s) de R$ 5.00%n", valor);
		x = x % 5.0;
		
		valor = (int) x / 2;
		System.out.printf("%d nota(s) de R$ 2.00%n", valor);
		x = x % 2.0;
		
		// correção para as moedas trabalharem com números int
		x = x * 100.0;
				
		System.out.println("MOEDAS:");			
				
		valor = (int) x / 100;
		System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
		x = x % 100.0;
		
		valor = (int) x / 50;
		System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
		x = x % 50.0;
		
		valor = (int) x / 25;
		System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
		x = x % 25.0;
		
		valor = (int) x / 10;
		System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
		x = x % 10.0;
		
		valor = (int) x / 5;
		System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
		x = x % 5.0;
		
		valor = (int) x / 1;
		System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
		x = x % 1.0;
		
		sc.close();
	}
}