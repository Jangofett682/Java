
//	2- Realizar un programa en java para adivinar un número al azar (del 1 al 10), imprimir si
//	acertó o no. (2 puntos)
import java.util.*;

public class Pregunta2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int a = r.nextInt(10)+1;
		
		System.out.println("Adivine el numero del 1 al 10: ");
		int b = sc.nextInt();
		System.out.println("El numero era: " + a);
		if(a == b)
		{
			System.out.println("Adivino! " + a + " Es igual a " + b);
		}
		else
		{
			System.out.println("No adivino");
		}
	}

}
