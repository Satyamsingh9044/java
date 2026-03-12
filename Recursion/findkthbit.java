
public class findkthbit {

    public static char findKthBit(int n, int k) {
        if (n == 1) 
            return '0';

        int mid = 1 << (n - 1);

        if (k == mid) {
            return '1';
        } 
        else if (k < mid) {
            return findKthBit(n - 1, k);
        } 
        else {
            char ch = findKthBit(n - 1, 2 * mid - k);
            return (ch == '0') ? '1' : '0';
        }
    }

    public static void main(String[] args) {
        int n=4;
        int k=11;
        System.out.println(findKthBit(n, k));
    }
}