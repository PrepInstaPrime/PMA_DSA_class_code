// problem statement: Print 1 to n even numbers
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        // Are we utilizing any other data structure like array, string
        // etc. which is based on input size
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=obj.nextInt();
        for(int i=2;i<=n;i++){
            if(i%2==0){
                System.out.println(i);  // n/2  
            }
        }
        // time complexity: O(n/2)-> O(n);
        // space complexity:  O(1)  // for every input size it will take the same space
    }
}
