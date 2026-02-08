import java.util.*;
public class MaxCapacitybudget { // lc-3814
    public static int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        int[][] machines = new int[n][2];
        for (int i = 0; i < n; i++) {
            machines[i][0] = costs[i];
            machines[i][1] = capacity[i];
        }
        Arrays.sort(machines, (a, b) -> a[0] - b[0]);
        int maxCapacity = 0;
        // Select only one machines
        for (int i = 0; i < n; i++) {
            if (machines[i][0] < budget) {
                maxCapacity = Math.max(maxCapacity, machines[i][1]);
            }
        }
        // Selcet two machines
        int left = 0, right = n - 1;
        while (left < right) {
            int totalCost = machines[left][0] + machines[right][0];
            if (totalCost < budget) {
                int currentCapacity = machines[left][1] + machines[right][1];
                maxCapacity = Math.max(maxCapacity, currentCapacity);
                left++;
            } else {
                right--;
            }
        }
        return maxCapacity;
    }

    public static void main(String[] args) {
        int costs[] = {4,8,5,3};
        int capacity[] = {1,5,2,7};
        int budget = 8;
        System.out.println(maxCapacity(costs, capacity, budget));
    }
}