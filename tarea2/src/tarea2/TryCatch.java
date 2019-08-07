package tarea2;
import java.util.Scanner;
import java.lang.Exception;
public class TryCatch {
	
	public static void main(String[] args) throws Exception
	{
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		int div;
		System.out.print("Escriba el primer entero:  "); 
		num1 = entrada.nextInt();
		System.out.print("Escriba el segundo entero:  "); 
		num2 = entrada.nextInt();
	try
	{
	    div = num1/num2;
		System.out.printf("La división es %d" , div);
		
	}
	catch(Exception exception){
		System.err.println("la excepción se manejo");
		System.out.printf("0/0 es indeterminado, pruebe con otros valores.");
		throw exception;
	}
	finally {
		System.err.println("se ejecuto finally");
	}
	}
}