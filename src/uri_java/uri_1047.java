package uri_java;

import java.util.Scanner;

public class uri_1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicio = sc.nextInt();
		int minInicio = sc.nextInt();
		int totalInicio = horaInicio * 60 + minInicio;
		
		int horaFim = sc.nextInt();
		int minFim = sc.nextInt();
		int totalFim = horaFim * 60 + minFim;
		
		int horaJogo = (totalFim - totalInicio) / 60;
		int minutos = (totalFim - totalInicio) % 60;
		
		if (totalFim - totalInicio == 0 && minInicio == minFim ) {
			horaJogo = 24;			
		}
		else if (horaInicio == horaFim && minInicio > minFim){
			horaJogo = 24 - 1;
			minutos = 60 - (minInicio - minFim);
		}
		
		System.out.println("O JOGO DUROU " + horaJogo + " HORA(S) E " + minutos + " MINUTO(S)");
		
		sc.close();
	}
}
