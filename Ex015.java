package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double a , b, c;
		
		System.out.printf("Digite o 1�lado: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o 2�lado: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o 3�lado: ");
		c = ler.nextDouble();
		
		if ((a + b > c) && (a + c > b) && (b + c >a)) {
			if ((a == b) && (a == c) && ( b == c)) {
				System.out.printf("O tri�ngulo � equil�tero.");
			}else if ((a != b) && (a != c) && ( b != c)){
				System.out.printf("O tri�ngulo � escaleno.");
			}else {
				System.out.printf("O tri�ngulo � is�celes.");
			}
		}
	}
}
