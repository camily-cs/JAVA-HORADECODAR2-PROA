package atividade2;
import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        /* 2. Faca um programa que leia um valor informado pelo usuario e diga se o valor informado e positivo, negativo ou zero. */
        System.out.println("Informe um valor");
        int valor = in.nextInt();

        if(valor > 0){
            System.out.println("O valor informado é positivo");
            
        } else if(valor < 0) {
        	System.out.println("O valor informado é negativo");
        	
        } else {
        	System.out.println("O valor informado foi 0");
        }

        in.close();
	}
}
//ok