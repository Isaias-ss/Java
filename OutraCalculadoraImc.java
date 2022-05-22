import java.util.Scanner;

public class OutraCalculadoraImc {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		
		System.out.println("sexo (1 para 'M' ou qualquer outro numero para 'F'): ");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';
		
		double imc = peso / (altura * altura);
		
		if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 19.1)) {
				System.out.println("Abaixo do peso.");
		} else if ((sexo == 'F' && imc >= 18.5 && imc <= 24.9) || (sexo == 'M' && imc >= 18.5 && imc <=24.9)) {
			System.out.println("Peso normal");
		} else if ((sexo == 'F' && imc >= 25.0 && imc <= 29.9) || (sexo == 'M' && imc >= 25.0 && imc <=29.9)) {
			System.out.println("Sobrepeso");
		} else if ((sexo == 'F' && imc >= 30.0 && imc <= 34.9) || (sexo == 'M' && imc >= 30.0 && imc <= 34.9)) {
			System.out.println("Obsidade (Grau I)");
		} else if ((sexo == 'F' && imc >= 35.0 && imc <= 39.9) || (sexo == 'M' && imc >= 35.0 && imc <= 39.9)) {
			System.out.println("Obseidade (Grau II)");
		} else if ((sexo == 'F' && imc >= 40.0) || (sexo == 'M' && imc >= 40.0)) {
			System.out.println("Obseidade (Grau III)");
		}
	}
}	
