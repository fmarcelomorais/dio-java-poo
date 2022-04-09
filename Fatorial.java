package exerciocioDio;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int fatorial = 1;
		System.out.println("Digite um numero ");
		numero = scan.nextInt();
		
		for(int c = numero; c > 0; c--) {
			fatorial *= c; 
		}
		System.out.println(numero +"! = "+ fatorial);
		scan.close();
	}
}
