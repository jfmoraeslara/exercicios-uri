package uri_java;

import java.util.Scanner;

public class uri_1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N > 0 && N < 1000000) {
			int r100 = N % 100;
			int v100 = N / 100;
			int r50 = r100 % 50;
			int v50 = r100 / 50;
			int r20 = r50 % 20;
			int v20 = r50 / 20;
			int r10 = r20 % 10;
			int v10 = r20 / 10;
			int r5 = r10 % 5;
			int v5 = r10 / 5;
			int r2 = r5 % 2;
			int v2 = r5 / 2;
			int v1 = r2 / 1;
			
			System.out.println(N);
			System.out.println(v100 + " nota(s) de R$ 100,00");
			System.out.println(v50 + " nota(s) de R$ 50,00");
			System.out.println(v20 + " nota(s) de R$ 20,00");
			System.out.println(v10 + " nota(s) de R$ 10,00");
			System.out.println(v5 + " nota(s) de R$ 5,00");
			System.out.println(v2 + " nota(s) de R$ 2,00");
			System.out.println(v1 + " nota(s) de R$ 1,00");
		}
								
		sc.close();
	}
}