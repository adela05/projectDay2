/* These files (List and ArrayList) were our group project the challenge
* was to create a LinkedList and we didn't have enough time to complete our
* main project. I will be including both LinkedList files as examples.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
       //String input = scanner.nextLine();

        // Hard coded the list instead of using the user input.
        List test1 = new ArrayList();
        //test1.add(input);
        test1.add("Bye");
        test1.add("Animals");
        test1.add("Dogs");
        test1.add("Cat");
        test1.add("Seal");
        test1.add("Whales");
        test1.add("Cows");
        test1.add("Lamb");
        test1.add("Snake");
        test1.add("Mouse");

        System.out.println(test1.size());
        System.out.println(test1.get(2));

        //this removes and shifts the next item in the ArrayList
        test1.remove(2);
        System.out.println(test1.size());
        System.out.println(test1.get(2));

    }
}
