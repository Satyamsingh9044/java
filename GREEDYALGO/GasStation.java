// class Solution { lc-134 Brute Force
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int n=gas.length;
//         for(int i=0;i<n;i++){
//             if(gas[i]<cost[i]) continue;
//         int j=(i+1)%n;
//         int costForMovingNextStation=cost[i];
//         int gasEarnInNextStation=gas[j];
//         int currGas=gas[i]-costForMovingNextStation+gasEarnInNextStation;
//         while(j!=i){
//             if(currGas<cost[j]) break;
//            int costForMovingNextStationj=cost[j];
//              j=(j+1)%n;
//             currGas=currGas-costForMovingNextStationj+gas[j];
//         }
//         if(j==i) return i;
//         }
//         return -1;
//     }
    
// }

//Greedy Approch

// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int n=gas.length;
//         int totalGas=0;
//         int totalCost=0;
//         for(int i=0;i<n;i++){
//             totalGas +=gas[i];
//             totalCost +=cost[i];
//     }
//     if(totalGas<totalCost){
//         return -1;
//     }
//     int result=0;
//     int total=0;
//     for(int i=0;i<n;i++){
//         total +=gas[i]-cost[i];
//         if(total<0){
//             result=i+1;
//             total=0;
//         }
//     }
//     return result;
//     }
// }