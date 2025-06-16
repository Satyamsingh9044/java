
public class largest {
    public static int largest(int arr[]){
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(lar<arr[i]){
                lar=arr[i];
            }
        }
        return lar;
    }
    public static void main(String[] args) {
        int arr []={ 2,5,6,9,1,8};
        int ans=largest(arr);
        System.out.println(ans);

    }
}

