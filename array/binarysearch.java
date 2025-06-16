public class binarysearch {
    public static int binarySearch(int arr[], int key) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key)
                i = mid + 1;
            if (arr[mid] > key)
                j = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 8, 9 };
        int key = 6;
        int index = binarySearch(arr, key);
        System.out.print("the key is found at index : " + index);
    }
}
