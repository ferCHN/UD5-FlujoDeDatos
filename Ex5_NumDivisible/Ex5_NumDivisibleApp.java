import java.util.Scanner;

public class Ex5_NumDivisibleApp {

	public static void main(String[] args) {
		
		int num1;
		int divisor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		num1 = teclado.nextInt();
		System.out.println("Introduce el divisor:");
		divisor = teclado.nextInt();
		if(num1%divisor == 0)
		{
			System.out.println("El "+num1+" es divisible por "+divisor);
		}
		else
		{
			System.out.println("El "+num1+" no es divisible por "+divisor);
		}
		teclado.close();
	}
}
