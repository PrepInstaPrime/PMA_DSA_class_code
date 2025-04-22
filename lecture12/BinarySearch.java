public class BinarySearch {
    static int search(int nums[], int target){ // nums=[1,2,3,4,5,6,7,8], target=50
        int start=0;  
        int end=nums.length-1;
        while(start<=end){   // step 1: 0<=7 true // step 2: 4<=7  // step 3: 6<=7 // step 4: 
            // 7<=7  // 8<=7 false
            int mid= (start+end)/2; // (0+7)/2=> 3 // mid= (4+7)/2 =5 //  mid=6 // mid=7
            if(nums[mid]==target){  // nums[3]=4 , 4==50 false// nums[5]==50, 6==50 false
                // 7==50 false // 8==50 false
                return mid;
            }else if(nums[mid]>target){ // 4>50 false // 6>50 false // 7>50 // 8>50
                end=mid-1;
            }else{
                start=mid+1; // start =4 // start=6 // start= 7 // start =8
            }
        }
        return -1;

        // when in every iteration u are dividing the input size by number k then the time 
        // complexity will log(base k) n
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5,6,7,8};
        int target=50;
        System.out.println(search(nums, target));
    }
}
