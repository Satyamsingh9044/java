public class maxsubarr {
        public static void subarray(int arr[],int n){
            int maxsum=Integer.MIN_VALUE;
            int minsum=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int sum=0;
                    for(int k=i;k<=j;k++){
                        sum=sum+arr[k];
                    }
                    if(maxsum<sum){
                        maxsum=sum;
                    }
                    if(minsum>sum){
                        minsum=sum;
                    }
                }
            }
            System.out.println("The maximum sum of subarray is : "+maxsum);
            System.out.println("The minimum sum of subarray is : "+minsum);
        }
        public static void main(String[] args){
            int arr[]={1,2,3,4,5};
            int n=arr.length;
            subarray(arr,n);
        }
}
