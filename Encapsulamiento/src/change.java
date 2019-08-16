
public class change {
	private int edad;
	//para establecer un valor a esta variable desde otra
	//no se puede por ser private, pero si se usa un setter esto es posible
	//metodo setter,ESTABLECE la edad
	public void setedad(int edad) {
		this.edad = edad;
	}

	//método getter, MUESTRA la edad
	public int getedad() {
		return edad;
	}
}
