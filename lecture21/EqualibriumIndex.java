import java.util.Scanner;

public class EqualibriumIndex {
    static int findEqualibriumIndex(int arr[]){
        int sum=0;
        for(int val:arr){
            sum+=val;
        }
        int left=0;
        int right=sum;
        for(int i=0;i<arr.length;i++){
            right=sum-left-arr[i];
            if(left==right){
                return i;
            }
            else{
                left+=arr[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findEqualibriumIndex(arr));

    }
}
