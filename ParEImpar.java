package exerciocioDio;

import java.util.Scanner;

public class ParEImpar {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int qtdNumeros;
		int count = 0;
		int par = 0;
		int impar = 0;
		int soma = 0;
		
		System.out.println("Quantos numeros deseja verificar");
		qtdNumeros = scan.nextInt();
		
		do {
			System.out.println("Digite um numeror ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) par++;
			if(numero % 2 != 0) impar++;
			soma += numero;
			count++;
		}while(count < qtdNumeros);
		scan.close();
		System.out.printf("A quantidade de numeros pares: [ %d ] e numeros impares: [ %d ]. A soma de todos os numeros é %d. ", par, impar, soma);
		
	}
}
