public class dutchnationalflag{
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static  void sorted(int arr[],int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,0,2,1,1,2,0};
        int n=arr.length;
        sorted(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}