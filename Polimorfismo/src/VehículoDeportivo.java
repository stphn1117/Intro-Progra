
public class VehÝculoDeportivo extends VehÝculo {
	private String Turbo;
	
	public VehÝculoDeportivo(String Turbo, String Placa, String MatrÝcula, String Modelo) {
		super(Placa, MatrÝcula, Modelo);
		// TODO Auto-generated constructor stub
	}
    //getter
	public String Turbo() {
		return Turbo;
	}
	
	@Override
	public String mostrarDatos() {
		return "MatrÝcula: "+ MatrÝcula+ "Modelo:"+ Modelo+"Placa"+ Placa+ "Turbo: "+Turbo;
	}

}
