package org.math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input ;
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while(!input.equals("quit"));

       //BREAK AND CONTINUE:
        while (true){ // we must have a break statement
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;//return to the loops beginning;
            if (input.equals("quit"))
                break;//leave the loop;
            System.out.println(input);
        }
    }
}