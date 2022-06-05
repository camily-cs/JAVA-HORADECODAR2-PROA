package atividade1;
import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        /* 1. Escreva um programa em que o usuario informe dois numeros. Entao escreva em tela o maior deles. */
        System.out.println("Informe o primeiro numero");
        int numero1 = in.nextInt();

        System.out.println("Informe o segundo numero");
        int numero2 = in.nextInt();


        if(numero1 > numero2){
            System.out.println("O maior numero é "+numero1);
        } else {
            System.out.println("O maior numero é "+numero2);
        }

        in.close();
	}
}
//ok