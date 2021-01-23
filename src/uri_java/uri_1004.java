package uri_java;

import java.util.Scanner;

public class uri_1004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int multiplicacao = x * y;
		
		System.out.println("PROD = " + multiplicacao);
		
		sc.close();
	}
}
