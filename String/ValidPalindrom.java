class ValidPalindrom {
    public static  boolean isPalindrome(String s) {
        if(s=="") return true;
        String news=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left=0;
        int right=news.length()-1;
        while(left<=right){
            if(news.charAt(left)!=news.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="A man,a plan,a canal:panama";
        System.out.println(isPalindrome(s));
    }
}