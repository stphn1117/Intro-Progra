
public class VehÝculoCarga extends VehÝculo {
    private int kg;
	public VehÝculoCarga(int kg,String Placa, String MatrÝcula, String Modelo) {
		super(Placa, MatrÝcula, Modelo);
		// TODO Auto-generated constructor stub
	}
	
	public int kg() {
		return kg;
	}
	
	@Override
	public String mostrarDatos() {
		return "MatrÝcula: "+ MatrÝcula+ "Modelo:"+ Modelo+"Placa"+ Placa+ "kg de carga:"+kg;
	}
	

}
