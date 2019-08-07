
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileSystemView;




public class excep extends JFrame {

	
 public excep() {
 
 super("Titulo de ventana");
 //----------------------------------------------seleccionar archivo------------------------
 
 JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
 
	int returnValue = jfc.showOpenDialog(null);
	if (returnValue == JFileChooser.APPROVE_OPTION) {
		File selectedFile = jfc.getSelectedFile();
		System.out.println(selectedFile.getAbsolutePath());
		System.out.println(jfc.getSelectedFile());
		
	}

 
 
 int Filas = 0;
 int colum = 1;
 BufferedReader br = null;
 File csvFile = jfc.getSelectedFile() ;

 String line = "";
 String cvsSplitBy = ",";

 //-------------------------------------------contar las casillas necesarias-------------------
 

 

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
    catch (RuntimeException e) {
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
 
 
   
    
	

	
//------------------------------------------------- interfaz ----------------------------

setSize(400, 300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container cp = getContentPane();
GridLayout gl = new GridLayout(colum-1,Filas);
gl.setHgap(5); gl.setVgap(5);

cp.setLayout(gl);
int cont=0;

System.out.println("columnas : "+(colum-1));
System.out.println("Filas : "+Filas);
//--------------------------------------------------------llenar de datos la interfaz-----------------------
     
	      try {
		  
	     		br = new BufferedReader(new FileReader(csvFile));
	     		
	     		while ((line = br.readLine()) != null) {   
	     			
	     			String[] data = line.split(cvsSplitBy);
	     			String[] data2 = line.split(";");
	     			for(int i = 0; i <=(Filas-1); i++) {
	     			JLabel etiqueta = new JLabel(String.valueOf(data2[i]));
	     			etiqueta.setAlignmentX(CENTER_ALIGNMENT);
	     			etiqueta.setForeground(Color.BLACK);
	     			etiqueta.setOpaque(true);
	     			etiqueta.setBackground(Color.pink);
	     			cp.add(etiqueta);
	     			
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
	     


}}
     