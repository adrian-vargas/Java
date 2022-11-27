import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Adrián";
		
		String pass="";
		
		while (clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if (clave.equalsIgnoreCase(pass)==false){
				
				System.out.println("Contraseña incorrecta");
				
			}
				
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");
		
	}

}
