package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
	
		Scanner ler= new Scanner(System.in);
		
		double a, b, cotacao;
		
		System.out.printf("Informe a cota��o do dia:");
		a = ler.nextDouble();
		
		System.out.printf("Informe o valor:");
		b = ler.nextDouble();
		
		cotacao = a * b;
		
		System.out.printf("Sua cota��o do dia �:R$ %.2f", cotacao);
	}

}
