import javax.swing.JFrame;



public class FileChooser extends JFrame {


	//----------------------------------------------------------Busqueda de archivos--------------------------

	public static void main(String[] args) {
		 
	/*	 
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		 
		int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			System.out.println(selectedFile.getAbsoluteFile());
			
		}	

	*/	
		//------------------------------------Parte Grafica--(ventana)------------------------------	
	
		miVentana v = new miVentana();
		v.setVisible(true);
	}
}
	
	

