package uri_java;

import java.util.Scanner;

public class uri_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int idade1 = x / 365;
		int idade2 = x % 365;
		int mes1 = idade2 / 30;
		int mes2 = idade2 % 30;
		int dia = mes2;
		
		System.out.println(idade1 + " ano(s)");
		System.out.println(mes1 + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		sc.close();
	}
}