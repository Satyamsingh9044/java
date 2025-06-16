public class ex7 {
    public static boolean abc(int arr[]){

        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]) return true;
                        }
        }
    return false;

    }
    public static void  main(String[] args){
        int arr[]={2,9,5,4,3,1};
        System.out.println(abc(arr));
    }
}
