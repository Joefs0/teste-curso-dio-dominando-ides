package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor");
		a = scan.nextInt();
		System.out.println("Digite o primeiro valor");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("A soma é: " + soma);
		System.out.println("A sub é: " + subtracao);
		System.out.println("A multi é: " + multiplicacao);
		System.out.println("A div é: " + divisao);
	}

	public static int soma (int a, int b) {
		return a + b;
	}
	public static int subtracao (int a, int b) {
		return a - b;
	}
	public static int multiplicacao (int a, int b) {
		return a * b;
	}
		public static float divisao (float a, float b) {
			return a / b;
	}
}
