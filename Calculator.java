// I used this program to practice Java syntax with 'for' loops
//     the 'case' command and unique Java 'printf()' statements.
import java.util.Scanner;
public class Calculator {

	public void multiple() {
		// 'printf' example:
		System.out.println("Multiples of '9'");
		for(int i=1; i<=10; i++)
			System.out.printf("%2d * %1d = %2d\n",i,9,i*9); // Java can do math within a for loop with minimal typing
	}

    public static void main(String[] args) {

		double num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");

		num1 = scanner.nextDouble();
		System.out.print("Enter second number: ");
		num2 = scanner.nextDouble();

		System.out.print("Enter an action: '+' '-' '*' '/' >");

		char operator = scanner.next().charAt(0);

		scanner.close();

		double output;

		switch(operator){
			
			case '+':
				output = num1 + num2;
				break;

			case '-':
				output = num1 - num2;
				break;

			case '*':
				output = num1 * num2;
				break;

			case '/':
				output = num1 / num2;
				break;

			default:
				System.out.printf("Invalid input...");
				return;
		}

		System.out.println(num1+" "+operator+" "+num2+" = "+output);

		Calculator nine = new Calculator();
		nine.multiple();
	}
        
}
