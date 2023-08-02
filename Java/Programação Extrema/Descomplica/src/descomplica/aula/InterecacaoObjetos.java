package descomplica.aula;

public class InterecacaoObjetos {

	public static void main(String[] args) {
		
		Aluno objeto = new Aluno();
		
      objeto.nome = "Jaderson";
      objeto.teste = 9;
      objeto.prova = 10;
      
      System.out.println(objeto.obterMedia());
	}

}
