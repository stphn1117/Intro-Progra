//getter setter
//setter--> establecer
//getter--> obtener
public class main {
	public static void main(String[] args) {
		change obj1 = new change();
		//obj1.edad = 10;
		//la forma anterior no funciona debido al modificador de acceso
		//private, en su lugar se usa 
		obj1.setedad(10);
		// que lo hace con el setter que está en main

		//Así se obtiene el valor transformado, llamando al metodo getter

		System.out.println("la edad es: "+obj1.getedad());
	}

}
