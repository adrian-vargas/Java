import javax.swing.JOptionPane;

public class Metodo_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String word=JOptionPane.showInputDialog("Escribe una palabra, por favor");
		
		int word_length=word.length();
		
		System.out.println("La palabra " + word + " tiene " + word_length + " letras" );
		*/
		
		String palabra=JOptionPane.showInputDialog("Escribe una palabra");
		
		System.out.println("La palabra "+palabra+" tiene "+ palabra.length() + " letras");
		
		String num=JOptionPane.showInputDialog("Escribe la posición deseada");
		
		System.out.println("La letra de la posición " + Integer.parseInt(num) + " en la palabra " + palabra + " es " + palabra.charAt(Integer.parseInt(num)-1));
		
		
		
		
	}

}
