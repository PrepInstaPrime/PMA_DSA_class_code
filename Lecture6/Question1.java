// Write a program that reads a number and prints the sum of the digits of that number.
public class Question1 {
    public static void main(String[] args) {
        int n=1231;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
