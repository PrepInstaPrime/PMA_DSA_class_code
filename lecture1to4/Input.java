import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a number:" );
        int a=obj.nextInt();
        System.out.println("Enter a float number:");
        float b=obj.nextFloat();
        System.out.println("Entered number were "+a +" and "+b);
    }
}
