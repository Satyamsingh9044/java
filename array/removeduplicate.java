public class removeduplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int k = 1; // index of next unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,4};
        int k=removeDuplicates(arr);
        // for(int i=0;i<k;i++){
            System.out.println(arr[0]);
        // }
    }
}
