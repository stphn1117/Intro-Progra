

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class FileChooser {
	

	public static void main(String[] args) {

		/*JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			System.out.println(selectedFile.getAbsoluteFile());
		//-----------------------------------------------------------------------------------------------------------------
		}*/
		
		//"Users/steph/OneDrive/Escritorio/prueba1.csv
		
		String csvFile = "prueba1.csv";
		BufferedReader br = null;
		String line = "";
		//Se define separador ","
		String cvsSplitBy = ",";
		
		try {
		    br = new BufferedReader(new FileReader(csvFile));
		    while ((line = br.readLine()) != null) {                
		        String[] datos = line.split(cvsSplitBy);
		        System.out.println(datos[0]);
		        System.out.println("do");
		    	}
		    System.out.println("do+2");
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
		            System.out.println("Finally try");
		        } 
		        catch (IOException e) {
		            e.printStackTrace();
		            System.out.println("Finally catch");
		        }
		    }
		
	}
}
}