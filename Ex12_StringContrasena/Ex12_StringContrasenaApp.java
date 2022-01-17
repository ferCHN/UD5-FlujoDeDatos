import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex12_StringContrasenaApp {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String password="azul";
        String passwordIntroducida="";
        int intentos = 0;
        //bucle para introducir la contraseña, controlar que sea la misma que el sistema
        //Se revisa que no se sobrepasa los 3 intentos 
        while (password.equals(passwordIntroducida)==false && intentos < 3) 
        {
        	passwordIntroducida=JOptionPane.showInputDialog("Introduce la contraseña");
            intentos++;
            //si la contraseña no coincide y se han introducido los 3 intentos, no se accede
            if (password.equals(passwordIntroducida)==false && intentos == 3) {
                JOptionPane.showMessageDialog(null, "Error: Has introducido los 3 intentos. "
            			+ "No dispones de acceso al sistema.");
            }
            //si la contraseña no coincide se muestra el numero de intentos introducidos
            else if (password.equals(passwordIntroducida)==false) {
            	JOptionPane.showMessageDialog(null, "Contraseña incorrecta. "
            			+ "Has introducido "+intentos+" de 3 intentos.");
            } else {  //si conicide, se muestra un mensaje de bienvenida
            	JOptionPane.showMessageDialog(null, "Enhorabuena, acceso correcto al sistema!");
            }
        }
		teclado.close();
	}
}
