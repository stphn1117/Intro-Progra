// extends= hereda de vehículo
public class VehículoTurismo extends Vehículo {
	//nueva variable de la clase hija
	private int nP;
	

	public VehículoTurismo(int nP, String Placa, String Matrícula, String Modelo) {
		super(Placa, Matrícula, Modelo);
		//inicializar
		this.nP = nP;
		// TODO Auto-generated constructor stub
	}
	//obtener valores
	public int getnP() {
		return nP;
	}
	//sobreescribir el método mostrar datos de la clase padre por medio de la hija para escribir los datos de esta tambien
	@Override
	public String mostrarDatos() {
		return "Matrícula: "+ Matrícula+ "Modelo:"+ Modelo+"Placa"+ Placa+ "\n Número de puertas" + nP;
		
		
	}

}
