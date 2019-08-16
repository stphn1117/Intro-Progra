
public class VehículoCarga extends Vehículo {
    private int kg;
	public VehículoCarga(int kg,String Placa, String Matrícula, String Modelo) {
		super(Placa, Matrícula, Modelo);
		// TODO Auto-generated constructor stub
	}
	
	public int kg() {
		return kg;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matrícula: "+ Matrícula+ "Modelo:"+ Modelo+"Placa"+ Placa+ "kg de carga:"+kg;
	}
	

}
