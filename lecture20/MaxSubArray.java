public class MaxSubArray {
    static int maxsub(int arr[], int target){
        int first=0;
        int sum=0;
        int maxwin= 0;
        for(int second=0;second<arr.length;second++){
            sum+=arr[second];
            while(sum>target){
                sum-=arr[first];
                first++;
            }
            maxwin= Math.max(maxwin, second-first+1);
        }
        return maxwin;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=6;
        System.out.println(maxsub(arr, target));
    }
}
