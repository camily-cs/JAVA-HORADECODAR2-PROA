package atividade3;
import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		/*
		 * Faça um programa para ler 3 valores (considere que não serão informados
		 * valores iguais) e escrever o maior deles.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		int valor1 = in.nextInt();
		
		System.out.println("Informe o segundo valor");
		int valor2 = in.nextInt();
		
		System.out.println("Informe o terceiro valor");
		int valor3 = in.nextInt();
		
		in.close();
		
		if(valor1 > valor2 && valor1 > valor3){
            System.out.println("O maior valor informado e "+valor1);
            
        } else if(valor2 > valor1 && valor2 > valor3){
            System.out.println("O maior valor informado e "+valor2);
            
        } else{
            System.out.println("O maior valor informado e "+valor3);
        }
	}
}
//ok