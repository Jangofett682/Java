package Arraylist;

public class EstudianteTest 
{
	public static void main(String[] args)
	{
		double[] calificacionesJose = {6.0, 7.5, 8.0};
		double[] calificacionesMati = {4.0, 6.0, 7.5};
		double[] calificacionesLuis = {7.6, 8,7, 9.0};
		double[] calificacionesJuan = {9.9, 7.5, 3.0};
		Estudiante[] estudiante=
		{
			new Estudiante("Jose",20,calificacionesJose),
			new Estudiante("Mati",18,calificacionesMati),
			new Estudiante("Luis",33,calificacionesLuis),
			new Estudiante("Juan", 31,calificacionesJuan),
		};
		
		for( Estudiante estu : estudiante) 
		{
		System.out.println("El estudiante: " + estu.getNombre()+ " Edad " + estu.getEdad()+ " Prom " + estu.calcularPromedio());
			
		}
	}
}