
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="Felipe Juan Froil�n de Todos los Santos";
		
		System.out.println("Mi nombre es "+nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
	
		System.out.println("La primera letra de "+nombre+" es " +nombre.charAt(0));
		
		int ultima_letra=nombre.length();
		
		System.out.println("La �ltima letra es la "+nombre.charAt(ultima_letra-1));
	}

}
