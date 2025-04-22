// write a java program which calculate the maximum sum of size k subarray in an array of size n.
public class MaxSum {
    static int maxSum(int arr[],int k){
        int n=arr.length;
        if(n<k){
            return -1;
        }
        int maxSum=Integer.MIN_VALUE;
        int CurrentSum=0;
        for(int i=0;i<k;i++){
            CurrentSum+=arr[i];
        }
        maxSum=Math.max(maxSum,CurrentSum);
        for(int right=k;right<n;right++){
            CurrentSum=CurrentSum+arr[right]-arr[right-k];
            maxSum=Math.max(maxSum,CurrentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        System.out.println(maxSum(arr,k));
    }
}
