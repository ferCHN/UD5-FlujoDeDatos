import java.util.Scanner;

public class Ex6_PrecioIvaApp 
{

	public static void main(String[] args) 
	{
		//declaro las variables, teniendo en cuenta que el iva es constante 
		//y el porcentaje tambien
		double precioProducto = 0;
		final double IVA = 21;
		final double porcentaje = 100;
		double costeIva;
		double precioFinal;
		
		//indico al usuario que introduzca el precio
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el precio del producto: ");
	    precioProducto = teclado.nextDouble();
	    //Se calcula el iva del producto y lo asigno a la variable costeIva
	    costeIva = precioProducto * IVA / porcentaje;
	    precioFinal = precioProducto + costeIva;
	    //Muestro en pantalla el resultado
	    System.out.println("Precio producto: "+precioProducto);
	    System.out.println("IVA: "+costeIva);
	    System.out.println("Total con iva: "+precioFinal);
	    
	    teclado.close();
	}
}