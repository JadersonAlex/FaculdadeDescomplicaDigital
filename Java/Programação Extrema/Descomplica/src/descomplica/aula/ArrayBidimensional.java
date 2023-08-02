package descomplica.aula;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		//int[][] matriz = new int[2][3]; // jeito 1
		int i, j;
		int matriz [][] = {{0,1,2},{3,4,5}}; // jeito 2
		
		/*// jeito de fazer  1
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		*/
		
		/*System.out.println(matriz[0][0]);
		System.out.println(matriz[1][2]);
*/
		for(i=0;i<2;i++) 
		{
			for(j=0;j<3;j++) 
			{
				System.out.println(matriz[i][j]);
			}
		}
	}

}
