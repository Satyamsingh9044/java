//brute force approch
public class mostwater{
    public static int mostWater(int arr[],int size){
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                 ans=(Math.min(arr[i],arr[j])*(j-i));
                max=Math.max(ans,max);
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[]={1,8,6,2,5,4,8,3,7};
        int size=arr.length;
        System.out.println(mostWater(arr,size));
    }
}