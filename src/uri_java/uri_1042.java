package uri_java;

import java.util.Arrays;
import java.util.Scanner;

public class uri_1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x[] = {a, b, c};
		int idx[] = {a, b, c};
					
		Arrays.sort(idx);		
		for (int valor: idx) {
			System.out.println(valor);		
		}		
		System.out.println();		
		for (int valor: x) {
			System.out.println(valor);
		}
			
		sc.close();
	}
}
