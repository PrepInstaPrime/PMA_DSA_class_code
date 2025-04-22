// Write a java program which add 5 in each element of an array which is not at prime index

import java.util.Arrays;

public class PrimeIndex {
    static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            if(!checkPrime(i)){
                arr[i]+=5;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
