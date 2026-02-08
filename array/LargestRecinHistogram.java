//Brute Force Approch
// public class LargestRecinHistogram{
//     public static int maxArea(int height[]){
//         int n=height.length;
//         int max=Integer.MIN_VALUE;
//         int maxarea=0;
//         for(int i=0;i<n;i++){
//             int h=height[i];

//             int left=i;
//             while(left>=0&&height[left]>=h){
//                 left--;
//             }

//             int right=i;
//             while(right<n&&height[right]>=h){
//                 right++;
//             }

//             maxarea=h*(right-left-1);
//             if(maxarea>max){
//                 max=maxarea;
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int height[]={2,1,5,6,2,3};
//         System.out.println(maxArea(height));
//     }
// }


//O(n) using Stack
import java.util.*;
class LargestRecinHistogram{
    public static  int largestRectangleArea(int[] height) {
        int maxArea=0;
        int nsl[]=new int[height.length];
        int nsr[]=new int[height.length];
        //Next Smallest Right
        Stack<Integer> s=new Stack<>();
        for(int i=height.length-1;i>=0;i--){
            while(!s.isEmpty()&& height[s.peek()]>=height[i]){
                s.pop();
            }
                if(s.isEmpty()){
                    nsr[i]=height.length;
                }else{
                    nsr[i]=s.peek();
                }
                s.push(i);
        }
        //Next Smallest Left
        s=new Stack<>();
        for(int i=0;i<height.length;i++){
            while(!s.isEmpty()&& height[s.peek()]>=height[i]){
                s.pop();
            }
                if(s.isEmpty()){
                    nsl[i]=-1;
                }else{
                    nsl[i]=s.peek();
                }
                s.push(i);
        }

        //Current area:width=(j-i-1)=nsr[i]-nsl[i]-1
        for(int i=0;i<height.length;i++){
            int length=height[i];
            int breadth=nsr[i]-nsl[i]-1;
            int currArea=length*breadth;
            maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[]={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(height));
    }
}