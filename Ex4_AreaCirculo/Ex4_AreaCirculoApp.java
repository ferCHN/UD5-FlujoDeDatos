import java.util.Scanner;

public class Ex4_AreaCirculoApp {

	public static void main(String[] args) {
		
		final double PI = Math.PI;
		String radio = "";
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica el valor del radio del circulo: ");
		radio= teclado.nextLine();
		double radioDouble = Double.parseDouble(radio);
		System.out.println("El area del circulo es "+PI*Math.pow(radioDouble, 2));
		
		teclado.close();
	}

}
