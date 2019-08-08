package tarea2;
import java.util.Scanner;
import java.lang.ArithmeticException;

public class TryCatch {

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		int div;
		String respuesta;

		try {
			System.out.print("divisiones donde el denominador sea mayor que 5 y el nominador menor que 100"+ "\n");
			System.out.print("Escriba el primer entero(numerador):  ");
			num1 = entrada.nextInt();
			System.out.print("Escriba el segundo entero(denominador):  ");
			num2 = entrada.nextInt();
			rango(num1,num2);
			
			div = num1 / num2;
			System.out.printf("La división es %d", div);
			respuesta=String.valueOf(div);
			
		} 
	    catch(ExcepcionIntervalo ex){
         respuesta = ex.getMessage();
         System.out.printf(respuesta);
         }
		catch (ArithmeticException e) {
			System.err.println("la excepción se manejo");
			System.out.printf("0/0 es indeterminado, pruebe con otros valores.");

		}
		catch(NullPointerException e){
			System.out.printf("Solo divisiones que den resultados enteros.");
			
		}finally {
			System.out.println(" Ha finalizado el proceso");
		}
	}
	
	
	static void rango(int num, int den)throws ExcepcionIntervalo{
		if((num>100)||(den<5)) {
			throw new ExcepcionIntervalo("Números fuera de rango");
		}
	}
}