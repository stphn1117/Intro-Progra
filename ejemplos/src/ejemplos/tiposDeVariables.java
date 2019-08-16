package ejemplos;

public class tiposDeVariables {
    
	public static void main(String[] args) {
		//Known to code within main() method
		int x;
		x=10;
		{//new scope
			int y=20; //variable visible only within the block
			System.out.println("x and y:"+x+" "+y);
			//calculates new x value 
			x=y*2;
			System.out.println("x new value:"+x);
		}

		//y=100; ---y doesn't exist now
		//x is accesible
		System.out.println("x is: "+x);
		//has been changed the x value
	}
}


