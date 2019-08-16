
public class VehículoDeportivo extends Vehículo {
	private String Turbo;
	
	public VehículoDeportivo(String Turbo, String Placa, String Matrícula, String Modelo) {
		super(Placa, Matrícula, Modelo);
		// TODO Auto-generated constructor stub
	}
    //getter
	public String Turbo() {
		return Turbo;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matrícula: "+ Matrícula+ "Modelo:"+ Modelo+"Placa"+ Placa+ "Turbo: "+Turbo;
	}

}
