
public class Veh�culoCarga extends Veh�culo {
    private int kg;
	public Veh�culoCarga(int kg,String Placa, String Matr�cula, String Modelo) {
		super(Placa, Matr�cula, Modelo);
		// TODO Auto-generated constructor stub
	}
	
	public int kg() {
		return kg;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matr�cula: "+ Matr�cula+ "Modelo:"+ Modelo+"Placa"+ Placa+ "kg de carga:"+kg;
	}
	

}
