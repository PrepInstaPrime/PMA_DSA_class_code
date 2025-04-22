// write java program to print prime numbers till n 
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= obj.nextInt();
        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=2;j<i;j++){
                 if(i%j==0){
                    count++;
                 }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
