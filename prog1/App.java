package prog1; 

import java.util.*;

public class App 
{

	public static void main(String[] args)
	{
		
		menu();
		Scanner scanner = new Scanner(System.in);
		int op = scanner.nextInt();
		System.out.println("Su opcion es: " + mostrarMensaje(op));
	}	


private static String mostrarMensaje(int op)
{
	
	String respuesta = "";
	if(op == 1)
	{
		respuesta  = "Compras";
	}
	else if(op ==2)
	{
		respuesta = "Ventas";
	}
	else if(op == 3)
	{
		respuesta = "Reclamos";
	}
	else if(op == 4)
	{
		respuesta = "Salir";
	}
	else 
	{
		respuesta = "ERROR";
	}
	return respuesta;
	
	
};
	private static void menu()
	{
	System.out.println("Systema");
	System.out.println("1-Compras 2-Ventas 3-Reclamos 4-Salir");
	}
}
