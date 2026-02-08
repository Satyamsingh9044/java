public class SingalElementSorted {   //Leetcode 540
    public static  int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            // make mid even
            if(mid%2!=0) mid--;
             // unique on right
            if(nums[mid]==nums[mid+1]){
                low=mid+2;
            }else{   // unique on left including mid
                high=mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int nums[]={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

}
