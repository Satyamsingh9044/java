public class PalindromPartitioning {
    public static boolean isPalindrom(String s){
        int j=s.length()-1;
        int i=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void palindroms(String s,int idx,String ans){
        if(idx==s.length()){
    ;        if(isPalindrom(ans)){
                System.out.print(ans+" ");
            }
            return;
            
        }
        palindroms(s,idx+1, ans+s.charAt(idx));
        palindroms(s,idx+1, ans);
    }
    public static void main(String[] args) {
        String s="aab";
        palindroms(s,0, "");
    }
}
