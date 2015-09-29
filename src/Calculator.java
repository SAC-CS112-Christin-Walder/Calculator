import java.util.Scanner;

public class Calculator	 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double number1;
		double number2;
		double sum;
		double difference;
		double product;
		double quotient;
		double calculator;
		
		
		
		System.out.print("Enter first number: ");
		number1=input.nextDouble();
		
		System.out.print("Enter second number: ");
		number2=input.nextDouble();
		
		System.out.println("What would you like to calculate?");
		System.out.println("Enter 1 for sum \nEnter 2 for difference \n"
				+ "Enter 3 for product \nEnter 4 for quotient");
		calculator=input.nextDouble();
		
		sum = number1 + number2;
		difference = number1 - number2;
		product = number1 * number2;
		quotient = number1 / number2;
		
		if (calculator==1)
			System.out.printf("Sum: %.2f\n", sum);
		else if (calculator==2)
			System.out.printf("Difference: %.2f\n", difference);
		else if (calculator==3)
			System.out.printf("Product: %.2f\n", product);
		else if (calculator==4)
			System.out.printf("Quotient: %.2f\n", quotient);
		else
			System.out.print("You made an invalid selection");
	
	}

}