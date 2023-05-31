package ARRAYLIST;
import java.util.ArrayList;
import java.util.ListIterator;


public class N1 
{
	public static void main(String[] args) 
	{

		   String[] palabras = {"Mati", "Jose", "Juan"};

		char caracter = 'J';
		int contadorpalabras = 0;

		for(String palabra : palabras)
		{
			if(palabra.charAt(0) == caracter)
			{
				contadorpalabras++;
			}	
		}
		System.out.println(contadorpalabras);
	}

}
