package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, �rea;
		
		System.out.printf("Digite a base do ret�ngulo: ");
		a= ler.nextDouble();
		
		System.out.printf("Digite a altura do ret�ngulo: ");
		b = ler.nextDouble();
		
		�rea = a * b;
		
		System.out.printf("A �rea �: %.2f * %.2f =%.2f", a, b, �rea);
	}

}
