package descomplica.aula;

public class ExercicioSwitch {

	public static void main(String[] args) {
		
		int numero = 5;
		
		switch(numero)
		{
		
		case 1:
			System.out.println("Você digitou 1");
			break;
			
		case 2:
			System.out.println("Você digitou 2");
			break;
			
		case 3:
			System.out.println("Você digitou 3");
			
			default:
				System.out.println("Você digitou um valor desconhecido");
		}
		
		
		
	}

}
