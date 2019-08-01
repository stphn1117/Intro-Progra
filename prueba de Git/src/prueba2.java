//uso del contructor de prueba.java para inicializar la variable de instacia
//nombre al momento d crear el objeto prueba
public class prueba2
{
	public static void main(String[] args)
	{
		//crear dos objetos
		prueba cuenta1 = new prueba("Jane Green");
		prueba cuenta2 = new prueba("John Blue");
	   //muestra el valor inicial de nombre para cada cuenta
		System.out.printf("el nombre de la persona es: %s%n", cuenta1.obtenerNombre());
		System.out.printf("el nombre de la persona es: %s%n", cuenta2.obtenerNombre());
	
	}

}
//fin de la clase prueba2