import java.awt.Container;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class miVentana extends JFrame {

	
 public miVentana() {
 
 super("Titulo de ventana");

 int Filas = 0;
 int colum = 1;
 BufferedReader br = null;
 String csvFile = "prueba2.csv";
 String line = "";
 String cvsSplitBy = ",";

 //--------------------contar las casillas-------------------
 

 

try {
	    br = new BufferedReader(new FileReader(csvFile));
	    while ((line = br.readLine()) != null) {                
	        String[] datos = line.split(cvsSplitBy);
	        String[] dat = line.split(";");
	        int count = dat.length;
	        Filas = count;
	        colum++;
	        }
	    }
	 	
	catch (FileNotFoundException e) {
	 		e.printStackTrace();
	 	} 
	catch (IOException e) {
	 		e.printStackTrace();
		} 
	finally {
		//System.out.println("Finally");
	    if (br != null) {
	        try {
	           br.close();
	           // System.out.println("Finally try");
	           
	            
	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	           // System.out.println("Finally catch");
	        }
	    }
	}
 
 
   
    
	

	
//-------------------------------------------------llenar la interfaz de datos----

setSize(400, 300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container cp = getContentPane();
GridLayout gl = new GridLayout(colum-1,Filas);
gl.setHgap(5); gl.setVgap(5);

cp.setLayout(gl);
int cont=0;

System.out.println("columnas : "+(colum-1));
System.out.println("Filas : "+Filas);
//--------------------------------------------------------llenar de datos-----------------------
     
	      try {
		  
	     		br = new BufferedReader(new FileReader(csvFile));
	     		
	     		while ((line = br.readLine()) != null) {   
	     			
	     			String[] data = line.split(cvsSplitBy);
	     			String[] data2 = line.split(";");
	     			for(int i = 0; i <=(Filas-1); i++) {
	     			cp.add(new JLabel(String.valueOf(data2[i])));
	     		    System.out.println("Posicion : "+ cont + "         dato : "+data2[i]);
	     			}
	     		   
				     	
			     		
	     		}
	       }
	   
	 	
	     	catch (FileNotFoundException e) {
	     		e.printStackTrace();
	     	} 
	     	catch (IOException e) {
	     		e.printStackTrace();
	     	} 
	     	finally {
	     		System.out.println("Finally");
	
	     		if (br != null) {
	     			try {
	     				br.close();  
	     				System.out.println("Finally cierre");
	     				} 
	     			catch (IOException e) {
	     				e.printStackTrace();
	        
	     				}}}
	     // cont++;
	     // System.out.println("contador:  "+ cont);
		   
//}


}}
     
     
     
     
     
     
     
     
     