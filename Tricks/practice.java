public class practice {
    public static void main(String[] args) {
        int nums[]={2,10,7,5,4,1,8,6};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans=0;
        int minIdx=-1;
        int maxIdx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                minIdx=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxIdx=i;
            }
        }
        System.out.println(minIdx +" "+maxIdx);
    }
}
