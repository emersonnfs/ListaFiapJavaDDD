package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int a , b, �rea;
		
		System.out.printf("Digite a base do tri�ngulo:");
		a= ler.nextInt();
		
		System.out.printf("Digite a altura do tri�ngulo:");
		b= ler.nextInt();
		
		�rea = (a * b) /2 ;
		
				
		System.out.printf("�: %d" ,�rea);
	}

}
