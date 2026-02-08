import java.util.*;
public class indiancoin{
    public static void main(String[] args){
        int arr[]={1,2,5,10,20,50,100,500,2000};
        int v=590;
        int ans=0;
        ArrayList<Integer> coins=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<=v){
                while(arr[i]<=v){
                    coins.add(arr[i]);
                    ans++;
                    v=v-arr[i];
                }
            }
        }
        System.out.println(ans);
        System.out.println(" coins used to pay : " + coins);
    }
}