package exerciocioDio;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int operando;
		
		System.out.println("A tabuada de qual numero você quer? ");
		operando = scan.nextInt();
		System.out.println("Tabuada de Multiplicação de "+ operando);
		for(int c = 1; c <=10; c++) {
			int soma = operando * c;
			//int mult = operando * c;
			//int sub = c - operando;
			//double div = operando / c;
			
			System.out.printf("%d X %d = %d\n", operando, c, soma);
			
		}
		scan.close();
			
	}
}
