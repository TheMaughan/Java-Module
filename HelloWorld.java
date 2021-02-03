/*

CSE310 Java Workshop - Example 1 - Solution

This example will use Hello World to explore the structure of 
a Java program including classes, main function, constructors, 
member data, and functions
*/

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
  }
}