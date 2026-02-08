public class NextPermutation{
    public static void nextPermutation(int arr[]){
        int lpivot=0;
        int rpivot=0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                lpivot=i;
                break;
            }
        }
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]>arr[lpivot]){
                rpivot=j;
                break;
            }
        }
        int temp=arr[lpivot];
        arr[lpivot]=arr[rpivot];
        arr[rpivot]=temp;

        int left=lpivot+1;
        int right=rpivot;
        while(left<right){
            int temp1=arr[left];
            arr[left]=arr[right];
            arr[right]=temp1;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,5};
        nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}