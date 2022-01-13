import javax.swing.JOptionPane;

public class Ex2y3_StringBienvenidoApp {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
		
		JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);
		
	}

}