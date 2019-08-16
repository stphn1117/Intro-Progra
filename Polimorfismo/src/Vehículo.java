
public class Vehículo {
//variables
	protected String Placa;
	protected String Matrícula;
	protected String Modelo;
	//costructores
	
	public Vehículo(String Placa, String Matrícula, String Modelo) {
		//inicializar
		this.Matrícula = Matrícula;
		this.Modelo = Modelo;
		this.Placa = Placa;
	}

	public String getPlaca() {
		return Placa;
	}

	public String getMatrícula() {
		return Matrícula;
	}

	public String getModelo() {
		return Modelo;
	}
 //método que cambiará en cada una de las clases para imprimir los valores de los objetos hechos en cada clase
	public String mostrarDatos() {
		//retornar los valores que hay
		return "Matrícula: "+ Matrícula+ "Modelo:"+ Modelo+"Placa"+ Placa;
	}
	
}
