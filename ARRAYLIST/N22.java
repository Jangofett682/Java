package ARRAYLIST;
import java.util.ArrayList;
import java.util.ListIterator;


public class N22
{
	public static void main(String[] args) 
	{
		
		String[] colores = {"azul", "verde", "amarillo", "rojo", "ertyw"};
		String color2 = colores[0];
		
		for(String color : colores)
		{
			if(color.length() > colores.length)
			{
				System.out.println(color);
			}
		}
	}
}