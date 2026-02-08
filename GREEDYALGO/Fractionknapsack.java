import java.util.*;
public class Fractionknapsack {
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        double ratio[][]=new double[value.length][2];
        //0th col idx; 1st col ratio
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        //Ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int capacity=w;
        int finalvalue=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            //include full item
            if(capacity>=weight[idx]){
                finalvalue +=value[idx];
                capacity -= weight[idx];
            }else{
                //include fractional item
                finalvalue +=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.err.println("the final value is : "+ finalvalue);
    }
}
