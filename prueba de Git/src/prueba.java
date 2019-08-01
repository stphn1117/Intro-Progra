//clase prueba con un contructor que inicializa el nombre
public class prueba {
	private String nombre;//variable de instancia
	//el contructor inicializa el nombre con el parametro nombre
	public prueba(String nombre) 
	{//el nombre del constructor es el nombre de la clase
		this.nombre = nombre;
	}
//metodo para establecer el nombre
	public void establecerNombre(String nombre)
	{
		this.nombre = nombre;
	}
 //metodos para recuperar el nombre
	public String obtenerNombre()
	{
	 return nombre;
	}
}// fin de la clase
