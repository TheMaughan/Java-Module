/*

CSE310 Java Workshop - Example 1 - Solution

This example will use Hello World to explore the structure of 
a Java program including classes, main function, constructors, 
member data, and functions
*/
import java.util.Scanner;

public class HelloWorld {

  // Member data
  private String myName;

  /* Constructor */
  public HelloWorld(String myName) {
      this.myName = myName;
  }

  public void sayHello() {
      System.out.println("Hello World from sayHello");
  }

  public void sayHelloFromMe() {
      // Use member data
      System.out.println("Hello World from "+myName);
  }

  public void sayHelloFromYou(String yourName) {
      // Use parameter
      System.out.println("Hello World from "+yourName);
  }

  public void enterNum() {
      // This is used for simple user input:
      int num1, num2, sum;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter any number: ");
      num1 = scan.nextInt();
      
      System.out.println(" The number entered by user: "+num1);
      System.out.print("Enter your second number: ");      
      num2 = scan.nextInt();
      System.out.println(" The second number is: "+num2);
      scan.close();
      // Is the number positive or negative?
      if(num1 > 0){
          System.out.println(num1+" is a positive number");
      } else if(num1 < 0) {
          System.out.println(num1+" is a negative number");
      } else {
          System.out.println(num1+" is neither positive or negative");
      }

      sum = num1 + num2;

      System.out.println("Sum of your two entries: "+sum);
  }

  /* In REPL, it will look for the main function
     in a class called Main.  In other tools, you don't
     need to call the class Main. 
  */
  public static void main(String[] args) {
      System.out.println("Hello World from main");

      HelloWorld hello = new HelloWorld("Bob"); // Create new hello object
      hello.sayHello();
      hello.sayHelloFromYou("Sue");
      hello.sayHelloFromMe();
      hello.enterNum();

      
  }
}