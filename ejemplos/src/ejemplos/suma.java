package ejemplos;
import java.util.Scanner;
public class suma {
	//crea objeto scanner para obtener la entrada de la vevntana de comandos
	public static void main(String[] args)
	{
	Scanner entrada = new Scanner(System.in);
	int num1;
	int num2;
	int suma;
	System.out.print("Escriba el primer entero:  "); //indicador
	num1 = entrada.nextInt();//lee el primer numero
	System.out.print("Escriba el segundo entero:  "); //indicador
	num2 = entrada.nextInt();// lee el segundo numero
	suma = num1 + num2;
	System.out.printf("La suma es %d%n" , suma);	

}
}
