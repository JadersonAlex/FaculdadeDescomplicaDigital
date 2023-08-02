package descomplica.aula;

import java.util.Scanner;

public class ExercicioNota {

	

	public static void main(String[] args) {
		
		Scanner  input = new Scanner(System.in); // teclado
		
		double nota1, nota2, nota3, media;
		
        System.out.println("Digite o valor da nota 1: ");
        nota1 = input.nextDouble();
        
        
        System.out.println("Digite o valor da nota 2: ");
        nota2 = input.nextDouble();
        
        
        System.out.println("Digite o valor da nota 3: ");
        nota3 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A media é igual a: " + media);
        
        if(media>= 7)
        {
        	System.out.println("Aprovado");
        }
        else 
        {
        	if(media<4) 
        	{
        		System.out.println("Reprovado");
        	}
        	else 
        	{
        		System.out.println("Final");
        	}
        }
        
        
     }
}
