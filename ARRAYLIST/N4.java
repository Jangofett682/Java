package ARRAYLIST;
import java.util.*;

public class N4 
{
	public static void main(String[] args)
	{
		String[] nombres = {"Lucas" ,"Mati", "Juan"};
		
		char voc1 = 'a';
		char voc2 = 'e';
		char voc3 = 'i';
		char voc4 = 'o';
		char voc5 = 'u';
		int contador = 0;
		
		for(String nombre : nombres)
		{
			if(nombre.contains('a','e','i', 'o','u') )
			{
				contador++;
			}
			System.out.println(nombre + contador);
		}
		System.out.println("Total " + contador);
		
		
		
	}

}
