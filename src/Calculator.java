import java.util.Scanner;

public class Calculator	 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		int difference;
		int product;
		int quotient;
		int calculator;
		
		
		
		System.out.print("Enter first integer: ");
		number1=input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2=input.nextInt();
		
		System.out.println("What would you like to calculate?");
		System.out.println("Enter 1 for sum \nEnter 2 for difference \n"
				+ "Enter 3 for product \nEnter 4 for quotient");
		calculator=input.nextInt();
		
		sum = number1 + number2;
		difference = number1 - number2;
		product = number1 * number2;
		quotient = number1 / number2;
		
		if (calculator==1)
			System.out.printf("Sum: %d\n", sum);
		else if (calculator==2)
			System.out.printf("Difference: %d\n", difference);
		else if (calculator==3)
			System.out.printf("Product: %d\n", product);
		else if (calculator==4)
			System.out.printf("Quotient: %d\n", quotient);
		else
			System.out.print("You made an invalid selection");
	
	}

}