import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    static int[] solution(int arr[],int N, int idx[]){
        int prefixsum[]= new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefixsum[i]=sum;
        }
        int res[]= new int[N];
        for(int i=0;i<N;i++){
            res[i]=prefixsum[idx[i]];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int N=sc.nextInt();
        int idx[]= new int [N];
        for(int i=0;i<N;i++){
            idx[i]=sc.nextInt();
        }
     System.out.println(Arrays.toString(solution(arr, N, idx)));

    }
}
