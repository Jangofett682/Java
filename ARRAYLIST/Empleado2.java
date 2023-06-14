package Arraylist;

public class Empleado2 
{
	public static void main(String[] args)
	{
		Empleado[] empleado=
		{
 			new Empleado("Juan", 4, 300.0),
			new Empleado("Mati", 6, 100.0),
			new Empleado("Jose", 2, 100.0),
		};
		
		
		for( Empleado emp : empleado) 
		{
			emp.aplicarAum();
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("El empleado: " + emp.getNombre()+ " Edad " + emp.getAnti()+ " Prom " + emp.getSalario());
		System.out.println("+++++++++++++++++++++++++++++++");
		}
			
		
		
		
		
	}
}
