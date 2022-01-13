
public class Ex1_DosVariables 
{

	public static void main(String[] args) 
	{
		
		int num1 = 20;
		int num2 = 20;
		
		//En estos 3 casos puedo determinar cual num es mas grande o igual y mostrarlo
		if(num1>num2)
		{
			System.out.println("El "+num1+" es mas grande que "+num2);
		}
		else if(num2>num1)
		{
			System.out.println("El "+num2+" es mas grande que "+num1);
		}
		else if(num1==num2)
		{
			System.out.println("El "+num1+" es igual a "+num2);
		}	
	}
}
