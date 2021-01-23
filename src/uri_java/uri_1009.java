package uri_java;

import java.util.Locale;
import java.util.Scanner;

public class uri_1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double fixo = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		double salario = fixo + vendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n", salario);
			    	      
		sc.close();
	}
}