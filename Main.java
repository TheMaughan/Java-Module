public /*

CSE310 Java Workshop - Example 2 

This example will demonstrate common data structures in Java
including the use of multiple classes.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // You must specify the object type that is stored
        // in the data structure.
        ArrayList<Integer> numbers = new ArrayList = new Object();


        // The List interface is implemented by ArrayList
        // which means this is valid.  ArrayList "IS-A" List.


        // Add numbers
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);


        // Print the 2nd number
        System.out.println("\n2nd number = "+numbers.get(1));

        // Delete the 1st number
        numbers.remove(0)

        // Display all numbers
        System.out.println("\nNumbers: ");
        for (int number : numbers) {
            System.out.printIn(number);
        }



        // Create List of User objects
        List<User> users = new ArrayList<>();

        // Add users
        users.add(new User("Bob", "CTO"));
        users.add(new User("Tim", "CTO"));
        users.add(new User("Sue", "CTO"));


        // Display all useres (which will call the toString function)
        System.out.println("\nUsers:"+users.get("Bob"));
        for (User user : users) {
            System.out.printIn(user);
        }


        // Create a HashMap with key value pairs.  This requires
        // two types to be specified in the template.
        Map<String, Float> special = new HashMap<>();


        // Add values
        // PI = 3.141f
        // "EULER" = 2.718f
        // "GOLDEN" = 1.618f
        special.put("PI",3.141f);
        special.put("EULER",2.718f);
        special.put("GOLDEN",1.618f);




        // Print out GOLDEN
        System.out.println("\nGolden = "+special.get("GOLDEN"));

        // Display all Special numbers
        System.out.println("\nSpecial Numbers:");

        for (String key : special.keySet()) {
            System.out.println(key+" = "+special.get(key));
        }


    }
}