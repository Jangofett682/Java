package Arraylist;

public class Estudiante {
	
	public String nombre;
	public int edad;
	public double[] calificacion;	
	
	public Estudiante(String n, int  e, double[]  c)
	{
		nombre = n;
		edad = e;
		calificacion = c;
	}
	
	public String getNombre() 
	{
	
		return nombre;
	}
	 public int getEdad()
	{
		return edad;
	}
	public double[] getCalifi()
	{
		return calificacion;
	}
	
	public void setNombre(String n)
	{
		nombre = n;
	}
	public void setEdad(int e)
	{
		edad = e;
	}
	public void setCalifi(double[] c)
	{
		calificacion = c;
	}
	public double calcularPromedio() 
	{
        double suma = 0;
        for (double calificaciones : calificacion) 
        {
            suma += calificaciones;
        }
        
        double prom = suma / calificacion.length;
        
        return prom;
	
	}	
}



