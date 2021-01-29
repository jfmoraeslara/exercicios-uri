package uri_java;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class uri_1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
				
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		
		double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
		System.out.println("Media: "+ df.format(media));
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
			double exame = sc.nextDouble();
			double mediaFinal = (media + exame) / 2;
			System.out.println("Nota do exame: " + df.format(exame));			
			if ( mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");				
			}

			System.out.println("Media final: " + df.format(mediaFinal));		
		}					
		sc.close();
	}
}
