import java.util.*;
public class Memoization {
    static int dp[];
    static int fibbo(int n){
        if(n>=1){
            dp[1]=1;
        }
        if(n<=1) return n;
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args) {
        int n=0;
        dp= new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        System.out.println(fibbo(n));
        System.out.println(Arrays.toString(dp));

    }

}

