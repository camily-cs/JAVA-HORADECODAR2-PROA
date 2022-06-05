package atividade5;
import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que leia dois valores informados pelo usuário e exiba uma
		 * das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais
		 * ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo
		 * maior’, caso o segundo seja maior que o primeiro.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		int valor1 = in.nextInt();
		
		System.out.println("Informe o segundo valor");
		int valor2 = in.nextInt();
		
		in.close();
		
			if(valor1 > valor2) {
				System.out.println("Primeiro valor é maior");
				
			} else if(valor1 < valor2) {
				System.out.println("Segundo valor é maior");
				
			} else {
				System.out.println("valores iguais");
			}
		}
	}
//ok