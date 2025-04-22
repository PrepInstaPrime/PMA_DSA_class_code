// palindome is numebr that reads the same forwards and backwards
// 121, 12321, 1234321, 123454321, 12345654321, 1234567654321, 123456787654321, 12345678987654321, 12345678910987654321
public class Palindrome {
    static boolean isPalindrome(int n){
        int copy= n;
        int rev=0;
        while(copy>0){
            int rem=copy%10;
            rev=rev*10+rem;
            copy=copy/10;
        }
        return rev==n;
    }
    public static void main(String[] args) {
        int n=1231;
        System.out.println(isPalindrome(n));
    }
}
