public class longestSubwithoutRep {
    public static boolean isValid(String str){
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(freq[s]==1){
                return false;
            }
            freq[s]=1;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        int maxl=0;
        // System.out.println("All substrings:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // System.out.println(str.substring(i, j));
                String s=str.substring(i, j);
                if(isValid(s)){
                    maxl=Math.max(maxl,s.length());
                }
            }
        }
        System.out.println(maxl);
    }
}
