package dio.aula;

import java.util.Scanner;

/*Aula 1 e Aula 2 de variaveis
 * 
 
 */

public class Main {

	public static void main(String[] args) {
		//Calculadora
		float a, b;
		Scanner scan = new Scanner(System.in);//Inicia o scanner
		
		System.out.println("Digite o primeiro número: ");
		a = scan.nextFloat();//lê o primeiro número
		
		System.out.println("Digite o segundo número: ");
		b = scan.nextFloat();//lê o segundo número
		
		Calculadora.soma(a, b);
		Calculadora.subtracao(a, b);
		Calculadora.multiplicacao(a, b);
		Calculadora.divisao(a, b);
		
				
		//Cumprimento
		
		Cumprimento.Mensagem(8);
		Cumprimento.Mensagem(13);
		Cumprimento.Mensagem(3);
		Cumprimento.Mensagem(40);
		
		//Imprestimo
		System.out.println("Qual valor para o imprestimo");
		double valor = scan.nextDouble();
		Imprestimo.calcular(valor, 2);
		Imprestimo.calcular(valor, 3);
		
		scan.close();
	}

}
