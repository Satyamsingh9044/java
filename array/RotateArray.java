class RotateArray { //lc-189 Rotate Array
    public static void rotate(int[] nums, int k) {
        int z=nums.length;
        k=k%z;
        reve(nums,0,z-1);
        reve(nums,0,k-1);
        reve(nums,k,z-1);
    }
    static void reve(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        rotate(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}