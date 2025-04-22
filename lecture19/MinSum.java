public class MinSum {
    static int minsum(int arr[], int k){
        int minSum=0;
        int currentsum=0;
        for(int i=0;i<k;i++){
            currentsum+=arr[i];
        }
        minSum=currentsum;
        for(int i=k;i<arr.length;i++){
            currentsum= currentsum+arr[i]-arr[i-k];
            minSum=Math.min(minSum,currentsum);
        }
        return minSum;
    }
    public static void main(String[] args) {
       int arr[]={1,2,4,2,3,5,6,1,7};
       int k=3;
       System.out.println(minsum(arr,k));

    }
}
// problem statement: Given an array of integers of size ‘n’.
// Our aim is to calculate the maximum sum of ‘k’
// problem statement 2: given an array of integers of size ‘n’. Our aim is to calculate the minimum sum of ‘k’ consecutive elements in the array.