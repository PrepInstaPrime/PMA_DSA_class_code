// Write a program that reads a string and prints the number of words in the string. For example, if the input is "This is a test", the output should be 4.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = sc.nextLine();
        String words[] = message.split(" ");
        System.out.println(words.length);
    }
}
