public class maxsubprefix {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int prefix[] = new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
                }
                for(int i=0;i<n;i++){
                    int currSum=0;
                    for(int j=i;j<n;j++){
                        currSum=
                    }
                }
    }
}
