package uri_java;

import java.util.Scanner;

public class uri_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int horas1 = x / 3600;
		int horas2 = x % 3600;
		int minutos1 = horas2 / 60;
		int minutos2 = horas2 % 60;
		int segundos = minutos2;
		
		System.out.println(horas1 + ":" + minutos1 + ":" + segundos);
		
		sc.close();
	}
}