package atividade5;
import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia dois valores informados pelo usu�rio e exiba uma
		 * das tr�s mensagens a seguir: �N�meros iguais�, caso os n�meros sejam iguais
		 * �Primeiro � maior�, caso o primeiro seja maior que o segundo; �Segundo
		 * maior�, caso o segundo seja maior que o primeiro.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		int valor1 = in.nextInt();
		
		System.out.println("Informe o segundo valor");
		int valor2 = in.nextInt();
		
		in.close();
		
			if(valor1 > valor2) {
				System.out.println("Primeiro valor � maior");
				
			} else if(valor1 < valor2) {
				System.out.println("Segundo valor � maior");
				
			} else {
				System.out.println("valores iguais");
			}
		}
	}
//ok