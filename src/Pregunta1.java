// 1- Realizar un programa en java, que pida dos números por pantalla, luego imprimir si el
// primer número solicitado es mayor al segundo (2 puntos) 
import java.util.*;

public class Pregunta1 
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar Primer Numero:");
		int a = sc.nextInt();
		System.out.println("Ingresar Segundo Numero:");
		int b = sc.nextInt();
		System.out.println("Numero 1: " + a + "\nNumero 2: " + b);
		if(a>b)
		{
			System.out.println("El mayor es el Primer 1: " + a);
		}
		else
		{
			System.out.println("El mayor es el Segundo 2: " + b);

		}
		
		
	}
	

}
