package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	
	double peso, altura, imc;
	
	System.out.printf("Informe o seu peso em Kg: ");
	peso = ler.nextDouble();
	
	System.out.printf("Informe a sua altura em metros: ");
	altura = ler.nextDouble();
	
	imc = peso * (altura * altura);
	
	if ((imc >= 20) && (imc < 25)){
		System.out.printf("Voc� est� no peso ideal");
	}else {
		System.out.printf("Voc� n�o est� no peso ideal");
	}
	}

}
