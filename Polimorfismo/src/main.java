
public class main {
	//principal
	public static void main(String[] args) {
		Vehículo mios[] = new Vehículo[4];
		mios[0]= new Vehículo("Pk29","Toyota","2222");
		
		//POLIMORFISMO
		//Instaciaciín de vehiculo desde una de sus clases hijas
		mios[1] = new VehículoCarga(4,"TB99", "Honda", "8900");
		mios[2] = new VehículoDeportivo("45J/s", "18MN","BMW","1230");
		mios[3] = new VehículoTurismo(5,"QWD7","Audi","8976");
		
		
		for(/*i=0;i<4;i++*/ Vehículo vehiculos: mios) {
			System.out.println(vehiculos.mostrarDatos());
			
		}
	}
	
}
