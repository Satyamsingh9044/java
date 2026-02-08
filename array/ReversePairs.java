class ReversePairs {
    static int count = 0;

    public static  int reversePairs(int[] nums) {
        ms(nums, 0, nums.length - 1);
        return count;
    }

    private static  void merge(int arr[], int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }

    private static  void ms(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            ms(arr, left, mid);
            ms(arr, mid + 1, right);
            CountPairs(arr, left, mid, right);
            merge(arr, left, mid, right);
        }
    }

    private static  void CountPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,3,5,1};
        System.out.println(reversePairs(arr));
    }

}
