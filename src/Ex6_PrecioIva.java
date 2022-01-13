import java.util.Scanner;

public class Ex6_PrecioIva 
{

	public static void main(String[] args) 
	{
		
		/*6-Lee un número por teclado que pida el precio de un producto 
		(puede tener decimales) y calcule el precio final con IVA. 
		El IVA será una constante que será  del 21%*/
		
		//declaro las variables, teniendo en cuenta que el iva es constante y el porcentaje
		double precioProducto = 0;
		final double IVA = 21;
		final double porcentaje = 100;
		double costeIva;
		double precioFinal;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el precio del producto: ");
	    precioProducto = teclado.nextDouble();
	    costeIva = precioProducto * IVA / porcentaje;
	    precioFinal = precioProducto + costeIva;
	    System.out.println("Precio producto: "+precioProducto);
	    System.out.println("IVA: "+costeIva);
	    System.out.println("Total con iva: "+precioFinal);
	    
	    teclado.close();
	}
}
