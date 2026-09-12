//lc-452. Minimum Number of Arrows to Burst Balloons
import java.util.*;
public class ArrowsBurst {
    public int findMinArrowShots(int[][] points) {
        int ans=0;
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int preStart=points[0][0];
        int preEnd=points[0][1];
        for(int i=1;i<points.length;i++){
            int currStart=points[i][0];
            int currEnd=points[i][1];
            if(currStart>preEnd){
                ans++;
                preStart = currStart;
                preEnd = currEnd;
            }else{
                preStart=Math.max(preStart,currStart);
                preEnd=Math.min(preEnd,currEnd);
            }
        }
        ans++;
        return ans;
    }
    
}
