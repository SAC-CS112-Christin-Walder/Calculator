import java.util.Scanner;

public class Calculator	 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		double n1=input.nextDouble();
		
		System.out.print("Enter second integer: ");
		double n2=input.nextDouble();
		
		System.out.print("Select one: +, -, *, or /: ");
		String operator=input.next();
		
		if (operator.equals("+"))
			System.out.printf("\nCalculation: %.0f + %.0f = %.0f", n1, n2, n1 + n2);
		else if (operator.equals("-"))
			System.out.printf("\nCalculation: %.0f - %.0f = %.0f", n1, n2, n1 - n2);
		else if (operator.equals("*"))
			System.out.printf("\nCalculation: %.0f * %.0f = %.0f", n1, n2, n1 * n2);
		else if (operator.equals("/"))
			System.out.printf("\nCalculation: %.0f / %.0f = %.1f", n1, n2, n1 / n2);
		else
			System.out.print("You have made an invalid selection.");

	}

}