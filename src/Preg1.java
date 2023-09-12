
import java.util.*;

public class Preg1 
{
	
	

	public static void main(String[] args)
	{
		System.out.println("Comparar a  y b");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar numero 1:");
		int a  = sc.nextInt();
		System.out.println("Ingresar numero 2:");
		int b  = sc.nextInt();
		
	}
	
	public int Comparador(int a1,int b1)
	{
	 if(a1 > b1)
	 {
		 System.out.println("El numero uno es mayor que el numero dos por " + (a1-b1));
	 }
	 else if(b1 > a1)
	 {
		 System.out.println("El numero dos es mayor que el numero uno por" + (a1 = b1-a1));
	 }
	 else if(a1 == b1)
	 {
		 System.out.println("Son igulaes");
	 }
	 return a1;
	}
	
}
