package bot;

import java.time.LocalDate;
import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name="Pesho";
        LocalDate currentYear = LocalDate.now();

        System.out.println("Hello!My name is "+ name+".");
        System.out.println("I was created in "+ currentYear.getYear());
        System.out.println("Please, remind me your name.");
        System.out.print("> ");
        String myName = reader.nextLine();
        System.out.println("What a great name you have, "+myName+"!");
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        System.out.print("> ");
        while (reader.hasNextInt()) {
            int age = ((reader.nextInt() % 3) * 70 + (reader.nextInt() % 5) * 21 + (reader.nextInt() % 7) * 15) % 105;
            System.out.println("Your age is " + age + "; that's a good time to start programming!");
        }


    }
}
