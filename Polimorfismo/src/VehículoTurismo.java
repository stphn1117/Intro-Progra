// extends= hereda de veh�culo
public class Veh�culoTurismo extends Veh�culo {
	//nueva variable de la clase hija
	private int nP;
	

	public Veh�culoTurismo(int nP, String Placa, String Matr�cula, String Modelo) {
		super(Placa, Matr�cula, Modelo);
		//inicializar
		this.nP = nP;
		// TODO Auto-generated constructor stub
	}
	//obtener valores
	public int getnP() {
		return nP;
	}
	//sobreescribir el m�todo mostrar datos de la clase padre por medio de la hija para escribir los datos de esta tambien
	@Override
	public String mostrarDatos() {
		return "Matr�cula: "+ Matr�cula+ "Modelo:"+ Modelo+"Placa"+ Placa+ "\n N�mero de puertas" + nP;
		
		
	}

}
