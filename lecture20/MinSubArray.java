public class MinSubArray {
    static int minsub(int arr[], int target){
        int f=0;
        int minlen= arr.length+1;
        int sum=0;
        for(int s=0;s<arr.length;s++){
            sum+=arr[s];
            while(sum>=target){
                minlen= Math.min(minlen, s-f+1);
                sum-=arr[f];
                f++;
            }
        }
        return minlen==arr.length+1?-1:minlen;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int target=50;
        System.out.println(minsub(arr, target));
    }
}
