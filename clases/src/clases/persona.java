package clases;

public class persona {
	//especificar los atributos y metodos de los objetos y el molde de los objetos sería la clase
	String nombre;
	//objetos de tranferencia de datos solo tienen atributos
	int edad;
	
	
	persona(String nombre){
		this.nombre = nombre;
		//yo el objeto, mi nombre es igual a nombre
	}
	void decirNombre() {
		System.out.println("soy"+nombre);
	}

}
