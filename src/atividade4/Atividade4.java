
  package atividade4; import java.util.Scanner;
  
  public class Atividade4 {
	  public static void main(String[] args) {
		  /*Faça um programa que leia 3 valores (considere que não serão informados
		  valores iguais) e escrever a soma dos 2 maiores.*/
		  
		  Scanner in = new Scanner(System.in);
		  System.out.println("Informe o primeiro valor"); int valor1 = in.nextInt();
		  
		  System.out.println("Informe o segundo valor"); int valor2 = in.nextInt();
		  
		  System.out.println("Informe o terceiro valor"); int valor3 = in.nextInt();
		  
		  in.close();
		  
		  if(valor1 > valor2 && valor1 > valor3 && valor2 > valor3){
		  System.out.println("Os dois maiores valores sao "+valor1+" e "
		  +valor2+". A soma desses valores e igual a "+valor1+valor2);
		  
		  } else if(valor1 > valor2 && valor1 > valor3 && valor3 > valor2){
		  System.out.println("Os dois maiores valores sao "+valor1+" e "+valor3+".");
		  
		  } else if(valor2 > valor1 && valor2 > valor3 && valor1 > valor3){
		  System.out.println("Os dois maiores valores sao "+valor2+" e "+valor1+".");
		  
		  } else if(valor2 > valor1 && valor2 > valor3 && valor3 > valor1){
		  System.out.println("Os dois maiores valores sao "+valor2+" e "+valor3+".");
		  
		  } else if(valor3 > valor1 && valor3 > valor2 && valor1 > valor2){
		  System.out.println("Os dois maiores valores sao "+valor3+" e "+valor1+".");
		  
		  } else if(valor3 > valor1 && valor3 > valor2 && valor2 > valor1){
		  System.out.println("Os dois maiores valores sao "+valor3+" e "+valor2+"."); 
		  }
	 }
  }