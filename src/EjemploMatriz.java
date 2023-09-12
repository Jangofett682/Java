
public class EjemploMatriz 
{
	public static void main(String[] args)
	{
		int[][] matriz = { {3,3,3},{4,5,7},{12,20,8}};
		mostrarMatriz(matriz);
		System.out.println(algunaFilaTodosImpares(matriz));
		imprimirSoloFila(matriz, 1);
	}
	private static void imprimirSoloFila(int[][] matriz, int i) 
	{
		// TODO Auto-generated method stub
		for (int j = 0; j< matriz[i].length; j++)
		{
			System.out.println(matriz[i][j]);
		}
	}
	private static boolean algunaFilaTodosImpares(int[][] matriz) 
	{
		// TODO Auto-generated method stub
		boolean rta = false;
		for (int i = 0; i < matriz.length; i++)
		{
			rta = rta || todosElementosImparesPorFila(matriz[1]);
		}
		return rta;
	}
	private static boolean todosElementosImparesPorFila(int[] fila) 
	{
		// TODO Auto-generated method stub
		boolean rta = true;
		for(int i = 0; i < fila.length; i++)
		{
			rta = rta && (fila[i]%2)== 0;
		}
		return rta;
	}
	public static void mostrarMatriz(int[][] matriz)
	{
		for (int i = 0; i < matriz[i].length; i++)
		{
			for(int j = 0; j< matriz.length; j++)
			{
				System.out.println("");
			}
			
		}
		
	}
	
}
