import java.util.*;
public class Tabulation {
    public static void main(String[] args) {
        int n= 6;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
        System.out.println(Arrays.toString(dp));

    }
}
