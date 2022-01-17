import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10_NumVentasApp {

	public static void main(String[] args) {
		
		int numVentas;
		double precioVenta;
		double sumVenta = 0;
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce numero de ventas: ");
		numVentas = teclado.nextInt();
		System.out.print("Has introducido: "+numVentas+" ventas");
		System.out.println();
		//bucle for para introducir el precio de venta
		//dentro de este se suma y posteriormente se muestra por pantalla
		for(int i=1; i<=numVentas; i++)
		{
			System.out.println("Introduce el precio de cada venta");
			precioVenta= teclado.nextDouble();
			sumVenta = sumVenta + precioVenta;
		}
		//se muestra en pantalla la suma con formato decimal a 2 decimales
		System.out.println("La suma de la venta final es: "+df.format(sumVenta));
		teclado.close();
	}

}
