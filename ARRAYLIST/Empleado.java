package Arraylist;

public class Empleado 
{
	String nombre;
	int antiguedad;
	double salario;

	public Empleado(String n, int a , double s)
	{
		nombre = n;
		antiguedad = a;
		salario = s;
	}
	public String getNombre()
	{
		return nombre;
	}
	public int getAnti()
	{
	return antiguedad;	
	}
	public double getSalario()
	{
	 return salario;	
	}
	public void setNombre(String n)
	{
		nombre = n;
	}
	public void setAnti(int a)
	{
		antiguedad = a;
	}
	public void setSalario(double s)
	{
		salario = s;
	}
	
	public void aplicarAum()
	{
		if(antiguedad > 5)
		{
			salario = salario*1.10;
		}
		System.out.println(salario);
	}
	
	
	
}



/*					Ejercicio 2: Clase Empleado

  		Enunciado: Crea una clase llamada "Empleado"
			con los atributos: nombre, salario y antigüedad.
		Luego, crea un array de objetos "Empleado" y
		muestra el nombre y el salario actualizado de cada
		empleado después de aplicar un aumento del 10%
		a aquellos que tienen una antigüedad superior a 5

							años.*/

