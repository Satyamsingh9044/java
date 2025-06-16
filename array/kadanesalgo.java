// ALWAYS WORK 
public class kadanesalgo {
    public static void main(String[] args){
        int arr[]={-2,-1,-3,-4,-5};
        int maxSum=arr[0];
        int curSum=arr[0];
        for(int i=1;i<arr.length;i++){
            curSum=Math.max(arr[i],curSum+arr[i]);
            maxSum=Math.max(maxSum,curSum);
                }
                System.out.println(maxSum);
    }
}






//ISME JAB SAB NEGATIVE NUMBER HOGA TO ZERO RETURN KAR DEGA NEGATIVE NUMBER 
///RETURN KARNE KE LIYE ALAG SE CONDITION LIKHNA HOGA
// public class kadanesalgo {
    // public static void main(String[] args){
        // int arr[]={-2,-1,-3,-4,-5};
        // int maxSum=Integer.MIN_VALUE;
        // int curSum=0;
        // for(int i=1;i<arr.length;i++){
            // curSum=curSum+arr[i];
            // if(curSum<0){
                // curSum=0;
            // }
            // maxSum=Math.max(maxSum,curSum);
                // }
                // System.out.println(maxSum);
    // }
// }
// 
