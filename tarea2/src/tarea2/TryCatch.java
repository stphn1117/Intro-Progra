package tarea2;
import java.util.Scanner;
import java.lang.ArithmeticException;
public class TryCatch {
	
	public static void main(String[] args) throws Exception
	{
		
	try
	{
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		int div;
		System.out.print("Escriba el primer entero:  "); 
		num1 = entrada.nextInt();
		System.out.print("Escriba el segundo entero:  "); 
		num2 = entrada.nextInt();
	    div = num1/num2;
		System.out.printf("La división es %d" , div);
		
	}
	catch(ArithmeticException e){
		System.err.println("la excepción se manejo");
		System.out.printf("0/0 es indeterminado, pruebe con otros valores.");

	}
	finally {
		System.out.println(" Ha finalizado el proceso");
	}
	}
}