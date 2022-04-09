package exerciocioDio;

import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nota;
		System.out.println("nota ");
		nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {			
			System.out.println("nota invalida, digite outra nota ");
			nota = scan.nextInt();
		}
			System.out.println("Fim");
			scan.close();
	}
}
