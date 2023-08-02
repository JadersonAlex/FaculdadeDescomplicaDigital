package descomplica.aula;

import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 int valor;
	 
	 Scanner teclado = new Scanner(System.in);
	 
	 System.out.println("Digite um valor: ");
	 valor = teclado.nextInt();
	 
	 System.out.println("Resultado: " + valor/2);
	 System.out.println("Resto: " +valor%2); // mostra o resto da divisão
	
	}

}
