// I want to create a guess the number game where user will input the 
// number and the program will generate a random number and if both the numbers are same then print congrats you have guessed the number
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int comnum= (int)Math.floor(Math.random()*(100-1))+1;
        Scanner sc = new Scanner(System.in);
        // boolean nyet=true;
        int count=0;
        while(true){
            System.out.println("Enter the number to guess: ");
            int userInp=sc.nextInt();
            count++;
           if(userInp>comnum){
                System.out.println("you have guessed a greater number");
           }
           else if(userInp<comnum){
                System.out.println("you have guessed a smaller number");
           }else{
                System.out.println("Congrats you have guessed the number in "+count+" attempts");
                // nyet=false;
                break;
           }
           
        }
    }
}
