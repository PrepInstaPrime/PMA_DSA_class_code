// Write a java program which takes number as input and keep doing the sum of digits of the number until the sum is a single digit number.
// 12345-> 1+2+3+4+5=15-> 1+5=6
public class Question4 {
    static int digitsum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=12345;
        while(n>9){
            n=digitsum(n);
        }
        System.out.println(n);
    }
}
