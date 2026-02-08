public class practice{        
    public static void main(String[] args) {
        int arr[]={9,9,9};
        int num=arr[0];;
        for(int i=1;i<arr.length;i++){
            num=num*10+arr[i];
        }
        num+=1;
        int length = (num == 0) ? 1 : (int) Math.log10(num) + 1;
        System.out.println(length);
    }
}
