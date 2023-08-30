package prog1;

import java.util.Scanner;

public class App2 
{
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Selecione 2 numeros: ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		
		int a = sc.nextInt();
		
		System.out.println("Numero 2: ");
	
		int b = sc.nextInt();
		
		int c = 100;
		int d = 200;
		int e = 300;
		int f = 400;
		int g = 500;

		menu();
		
		int x = sc.nextInt();
		System.out.println("Respuesta: ");
		operacion(x, a, b);
		
		System.out.println("Promedio de las variables; ");
		System.out.println("Promedio:" + calcularProm(c, d, e, f, g));
	}
	
	
	private static double calcularProm(int var1, int var2, int var3, int var4, int var5) 
	{
	
		double resultado = var1 + var2 + var3 + var4 + var5;
		return resultado/5;
	}


	public static void operacion(int x, int a, int b)
	{
		if(x == 1)
		{
		 System.out.println(a + b);
		}
		else if(x == 2)
		{
			 System.out.println(a - b);
		}
		else if(x == 3)
		{
			 System.out.println(a * b);
		}
		else if(x == 4)
		{
			 System.out.println(a / b);
		}
		else
		{
			System.out.println("error");
		}
			
	}
	
	
	
	public static void menu()
	{
		System.out.println("Que accion desea realizar: ");
		System.out.println("-1 Sumar -2 Restar -3 Multiplicar -4 Dividir ");
		
	}
	
}
