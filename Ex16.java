package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, num1, num2, num3;
		
		System.out.printf("Digite o primeiro lado do tri�ngulo: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o segundo lado do tri�ngulo: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o terceiro lado do tri�ngulo: ");
		c = ler.nextDouble();
		
		num1 = a * a;
		num2 = b * b;
		num3 = c * c;
		
		if (num1 +num2 == num3) {
			System.out.printf("� um triangulo retangulo");
		}else if (num1 + num3 == num2) {
			System.out.printf("� um triangulo retangulo");
		}else if (num2 + num3 == num1) {
			System.out.printf("� um triangulo retangulo");
		}else { 
			System.out.printf("N�o � um triangulo retangulo");
		}
	}
}
