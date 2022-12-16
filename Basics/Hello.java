package Basics;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String firstname;
        String lastname;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your firstname ");
            firstname = input.nextLine();
            System.out.println("Enter your lastname ");
            lastname = input.nextLine();
        }

        String fullname = firstname + " " + lastname;
        System.out.println("Hello, " + fullname);

    }
}