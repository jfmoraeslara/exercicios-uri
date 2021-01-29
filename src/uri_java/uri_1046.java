package uri_java;

import java.util.Scanner;

public class uri_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		
		int hora = 0;
		if (inicio >= fim) {
			hora = 24 - inicio + fim;
		}
		else {
			hora = fim - inicio;
		}
		
		System.out.println("O JOGO DUROU " + hora + " HORA(S)");

		sc.close();
	}
}
