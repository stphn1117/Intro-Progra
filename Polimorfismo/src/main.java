
public class main {
	//principal
	public static void main(String[] args) {
		Veh�culo mios[] = new Veh�culo[4];
		mios[0]= new Veh�culo("Pk29","Toyota","2222");
		
		//POLIMORFISMO
		//Instaciaci�n de vehiculo desde una de sus clases hijas
		mios[1] = new Veh�culoCarga(4,"TB99", "Honda", "8900");
		mios[2] = new Veh�culoDeportivo("45J/s", "18MN","BMW","1230");
		mios[3] = new Veh�culoTurismo(5,"QWD7","Audi","8976");
		
		
		for(/*i=0;i<4;i++*/ Veh�culo vehiculos: mios) {
			System.out.println(vehiculos.mostrarDatos());
			
		}
	}
	
}
