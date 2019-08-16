package tarea2;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.ArithmeticException;

public class TryCatch {

	public static void main(String[] args) throws Exception {

		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		int div;
		String respuesta;
		JFrame frame = new JFrame("JOptionPane showMessageDialog example");

		try {
			System.out.print("divisiones donde numerador no sea mayor que 100 y el denominador no sea mayor a 10"+ "\n");
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
         JOptionPane.showMessageDialog(null, respuesta);
	    }
		catch (ArithmeticException e) {
			//System.err.println("la excepción se manejo");
			//System.out.printf("0/0 es indeterminado, pruebe con otros valores.");
			JOptionPane.showMessageDialog(null,"0/0 es indeterminado, pruebe con otros valores.");

		}
		catch(NullPointerException e){
			//System.out.printf("Solo divisiones que den resultados enteros.");
			JOptionPane.showMessageDialog(null,"Solo divisiones que den resultados enteros.");
			
		}finally {
			System.out.println(" Ha finalizado el proceso");
		}
	}
	
	
	static void rango(int num,int den)throws ExcepcionIntervalo{
		
		if((num>100)||(den>10)) {
			throw new ExcepcionIntervalo("Números fuera de rango");
		}
		
	}
	
	
}