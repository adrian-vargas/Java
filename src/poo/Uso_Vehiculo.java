package poo;

//import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Coche micoche1=new Coche();
		
		micoche1.establece_color("rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7,580);
		
		mifurgoneta1.establece_color("azul");
		mifurgoneta1.configura_asientos("s�");
		mifurgoneta1.configura_climatizador("s�");
		
		System.out.println(micoche1.dime_datos_generales() +" "+  micoche1.dime_color());
		System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.DimeDatosFurgoneta());
		
		// TODO Auto-generated method stub
		/*Coche Renault=new Coche(); //INSTANCIACI�N DE CLASE: Renault
		
		System.out.println(Renault.dime_largo());
		
		//System.out.println("Este coche tiene "+Renault.ruedas+" ruedas.");
		*/
		/*
		Coche micoche=new Coche();
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(micoche.dime_datos_generales());
		//micoche.color="rosa";
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("�Tiene asientos de cuero"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("�Tiene climatizador?"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es: " + micoche.precio_coche());
		*/
	}
	
	
	
}
