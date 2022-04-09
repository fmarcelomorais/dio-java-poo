package exerciocioDio;

import java.util.Scanner;

public class NomeEIdade {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome = " ";
		int idade;
		
		do {
			System.out.println("Nome ");
			nome = scan.next();
			System.out.println("Idade ");
			idade = scan.nextInt();	
		}while( !nome.equals(" "));
		
		System.out.println("Fim do programa"+ idade);
		
		scan.close();
 }
}
