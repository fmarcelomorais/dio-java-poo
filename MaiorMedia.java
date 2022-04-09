package exerciocioDio;

import java.util.Scanner;

public class MaiorMedia {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor;
		int count = 0;
		int maior = 0;
		int soma = 0;
		double media = 0;
		
		do {
			System.out.println("Digite o valor: ");
			valor = scan.nextInt();
			if(valor> maior) maior = valor;
			soma += valor;
			count++;
			
		}while(count < 5);
		media = soma / count;
		scan.close();
		System.out.printf("O Maior numero é %d e a media é %.1f", maior, media);
	}
}
