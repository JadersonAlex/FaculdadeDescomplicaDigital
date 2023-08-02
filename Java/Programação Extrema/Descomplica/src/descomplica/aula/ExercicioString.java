package descomplica.aula;

import java.util.Scanner;

public class ExercicioString {

	public static void main(String[] args) {
		  
		  Scanner teclado = new Scanner(System.in);
          String nome;
          
          System.out.println("Digite o seu nome: ");
          nome = teclado.next();
          
          
          System.out.println("Professor " + nome);

	}

}
