package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double genero, peso, altura, imc;
		
		System.out.printf("Digite 0 se for do g�nero masculino ou digite 1 se for do genero feminino: ");
		genero = ler.nextDouble();
		
		System.out.printf("Informe o seu peso em Kg: ");
		peso = ler.nextDouble();
		
		System.out.printf("Informe a sua altura em metros: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (genero == 0) {
			if ((20 <= imc) && (imc < 25)) {
				System.out.printf("Voc� est� no peso ideal. Par�bens");
			}else {
				System.out.printf("Voc� N�O est� no peso ideal.");
			}}
		else if (genero == 1) {
				if ((19 <= imc) && (imc < 24)) {
					System.out.printf("Voc� est� no peso ideal. Par�bens");
				}else {
					System.out.printf("Voc� N�O est� no peso ideal.");
		}}
	}
}
