
public class Veh�culoDeportivo extends Veh�culo {
	private String Turbo;
	
	public Veh�culoDeportivo(String Turbo, String Placa, String Matr�cula, String Modelo) {
		super(Placa, Matr�cula, Modelo);
		// TODO Auto-generated constructor stub
	}
    //getter
	public String Turbo() {
		return Turbo;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matr�cula: "+ Matr�cula+ "Modelo:"+ Modelo+"Placa"+ Placa+ "Turbo: "+Turbo;
	}

}
