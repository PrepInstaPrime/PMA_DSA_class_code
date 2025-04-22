public class Linear {
    static int linearSearch(int []nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,2,4,6,5,7,8,9,10};
        int target=11;
        System.out.println(linearSearch(nums, target));
        // boolean output=false;
        // for(int i=0; i<nums.length;i++){
        //     if(nums[i]==target){
        //         System.out.println(i);
        //         output=true;
        //         break;
        //     }
        // }
        // if(!output){
        //     System.out.println(-1);
        // }
       
    }
}
