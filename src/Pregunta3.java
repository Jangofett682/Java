
//	3- Realizar un programa en java que pida 10 números menores a 100, guardarlos en un
//	array, luego indicar si todos los números ingresados son mayores a 30 ( 3 puntos + 1
//	puntos si se utiliza acumuladores booleanos vistos en clase )
import java.util.*;

public class Pregunta3 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int f = 1;

		System.out.println("Ingrese 10 numero del 1 al 100");
		
		
		for(int i = 0; i < array.length; i++, f++)
		{
			System.out.println("Ingrese el numero " + f +" : ");
			array[i] = sc.nextInt();
			
			if( array[i] < 1 || array[i] > 100 )
			{
			 	System.out.println("El numero: " + (i+1) + " no esta entre 1 y 100 ");
			 	array[i]-- ; i--; f--;
			}		
		}
		
		for(int i = 0; i< array.length;i++)
		{
			if(array[i]< 30)
			{
				System.out.println("El numero " + (i +1) + " es menor a 30");
			}
		}
	}
}
