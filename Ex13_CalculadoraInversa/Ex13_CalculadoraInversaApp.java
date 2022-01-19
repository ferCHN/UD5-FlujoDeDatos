import java.util.Scanner;

public class Ex13_CalculadoraInversaApp {

	public static void main(String[] args) {
				
		int num1=0, num2=0, resultado=0;
		double resultadoDouble;
		String operador;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Selecciona una opcion:");
		System.out.println("+: Suma"
				+ "\n-: Resta"
				+ "\n*: Multiplicacion"
				+ "\n/: Division"
				+ "\n^: Operar la base con el exponente"
				+ "\n%: modulo, resto de la división entre operando1 y operando2.");
		operador = teclado.next();
		switch(operador)
		{
			case "+":
				System.out.println("Has seleccionado suma");
				System.out.println("Introduce el primer numero");
				num1=teclado.nextInt();
				System.out.println("Introduce el segundo numero");
				num2=teclado.nextInt();
				resultado = num1 + num2;
				System.out.println("El resultado de la suma es: "+resultado);
				break;
			case "-":
				System.out.println("Has seleccionado resta");
				System.out.println("Introduce el primer numero");
				num1=teclado.nextInt();
				System.out.println("Introduce el segundo numero");
				num2=teclado.nextInt();
				resultado = num1 - num2;
				System.out.println("El resultado de la resta es: "+resultado);
				break;
			case "*":
				System.out.println("Has seleccionado multiplicacion");
				System.out.println("Introduce el primer numero");
				num1=teclado.nextInt();
				System.out.println("Introduce el segundo numero");
				num2=teclado.nextInt();
				resultado = num1 * num2;
				System.out.println("El resultado de la multiplicacion es: "+resultado);
				break;
			case "/":
				System.out.println("Has seleccionado division");
				System.out.println("Introduce el primer numero");
				num1=teclado.nextInt();
				System.out.println("Introduce el segundo numero");
				num2=teclado.nextInt();
				resultado = num1 / num2;
				resultadoDouble = resultado;
				System.out.println("El resultado de la division es: "+resultadoDouble);
				break;
			case "^":
				System.out.println("Has seleccionado operar la base con el exponente");
				System.out.println("Introduce el primer numero");
				num1=teclado.nextInt();
				System.out.println("Introduce el segundo numero");
				num2=teclado.nextInt();
				resultado = num1 ^ num2;
				System.out.println("El resultado de operar la base con el exponente es: "
						+ ""+resultado);
				break;
			case "%":
				System.out.println("Has seleccionado el modulo");
				System.out.println("Introduce el primer numero");
				num1=teclado.nextInt();
				System.out.println("Introduce el segundo numero");
				num2=teclado.nextInt();
				resultado = num1 % num2;
				System.out.println("El resultado del modulo es: "+resultado);
				break;
			default:
				System.out.println("Error: No has seleccionado el operador adecuado");
				break;
		}
		teclado.close();
	}

}
