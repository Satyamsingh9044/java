public class index {
    public static int tilingProblem(int n) { // n is width of board
        // base case
        if (n == 0 || n == 1)
            return 1;
        // vertical choise
        int fnm1 = tilingProblem(n - 1);
        // horizontal choice
        int fnm2 = tilingProblem(n - 2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static String removeDuplicate(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (res.contains(String.valueOf(ch))) {
                continue;
            }
            res += ch;
        }
        return res;
    }

    public static void main(String[] args) {
        // System.out.println(tilingProblem(4));
        // String str="bbaacc%%*$*$";
        System.out.print(removeDuplicate("sdabfydgfhebaasssd"));
    }
}
