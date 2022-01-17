import java.util.Scanner;

public class Ex11_DiaSemanaApp {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		// Pedir al usuario un num de dia de semana
		System.out.println("Selecciona un numero correspondiente al dia de la semana ");
		System.out.println("1.- Lunes.");
		System.out.println("2.- Martes.");
		System.out.println("3.- Miércoles.");
		System.out.println("4.- Jueves.");
		System.out.println("5.- Viernes.");
		System.out.println("6.- Sábado.");
		System.out.println("7.- Domingo.");
		
		while(num>7 || num<1)
		{
			num = teclado.nextInt();
			switch (num) 
			{
				case 1:
					System.out.println("Lunes: es dia laboral");
					break;
				case 2:
					System.out.println("Martes: es dia laboral");
					break;
				case 3:
					System.out.println("Miercoles: es dia laboral");
					break;
				case 4:
			    	System.out.println("Jueves: es dia laboral");
			    	break;
			    case 5:
			    	System.out.println("Viernes: es dia laboral");
			    	break;
			    case 6:
			    	System.out.println("Sabado: no es dia laboral");
			    	break;
			    case 7:
			    	System.out.println("Domingo: no es dia laboral");
			    	break;
			    default:
			    	System.out.println("ERROR: número incorrecto.");
			    	break;
			    }
		}
		
		    teclado.close();
	}

}
