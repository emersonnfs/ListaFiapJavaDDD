package entrada_processamento_saída;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.printf("Informe o primeiro valor:" );
		a= ler.nextInt();
		
		System.out.printf("Informe o segundo valor:" );
		b= ler.nextInt();
		
		soma = a + b;
		
		System.out.printf("%d + %d =%d", a, b, soma);
	}

}
