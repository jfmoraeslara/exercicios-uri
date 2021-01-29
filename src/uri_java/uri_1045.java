package uri_java;

import java.util.Locale;
import java.util.Scanner;

public class uri_1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double troca;

		// condição para verificar se o A é o maior número
		if (B > A && B > C) {
			troca = A;
			A = B;
			B = troca;
		} else if (C > A) {
			troca = A;
			A = C;
			C = troca;
		}

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if (A * A == (B * B) + (C * C)) {
				System.out.println("TRIANGULO RETANGULO");
		}
		else if (A * A > (B * B) + (C * C)) {
				System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if (A * A < (B * B) + (C * C)) {
				System.out.println("TRIANGULO ACUTANGULO");
		}
		
		// verificar as arestas
		if (A == B && A == C) {
				System.out.println("TRIANGULO EQUILATERO");
		}
		else if (A == B && A != C || A == C && A != B || B == C && B != A) {
				System.out.println("TRIANGULO ISOSCELES");
		}		

		sc.close();
	}
}
