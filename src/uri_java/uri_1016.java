package uri_java;

import java.util.Locale;
import java.util.Scanner;

public class uri_1016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia = sc.nextInt();
		int minutos = ((60 * distancia) / 30);
		
		System.out.println(minutos + " minutos");
						
		sc.close();
	}
}