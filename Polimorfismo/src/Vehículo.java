
public class Veh�culo {
//variables
	protected String Placa;
	protected String Matr�cula;
	protected String Modelo;
	//costructores
	
	public Veh�culo(String Placa, String Matr�cula, String Modelo) {
		//inicializar
		this.Matr�cula = Matr�cula;
		this.Modelo = Modelo;
		this.Placa = Placa;
	}

	public String getPlaca() {
		return Placa;
	}

	public String getMatr�cula() {
		return Matr�cula;
	}

	public String getModelo() {
		return Modelo;
	}
 //m�todo que cambiar� en cada una de las clases para imprimir los valores de los objetos hechos en cada clase
	public String mostrarDatos() {
		//retornar los valores que hay
		return "Matr�cula: "+ Matr�cula+ "Modelo:"+ Modelo+"Placa"+ Placa;
	}
	
}
