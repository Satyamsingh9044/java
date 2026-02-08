public class LongestHappyPreifx {

    
    public static String longestPrefix(String s){  //TC=O(N^3) SC=O(N^2)
        int n=s.length()-1;
        String s1="";
        int max=Integer.MIN_VALUE;
        String[] prefixes=new String[n];
        String[] suffixes = new String[n];
        for(int i=0;i<n;i++){
            prefixes[i]=s.substring(0, i+1);
        }

        for(int i=0;i<n;i++){
            suffixes[i]=s.substring(i+1);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(prefixes[i].equals(suffixes[j]) && max<prefixes[i].length()){
                    s1=prefixes[i];
                    max=prefixes[i].length();
                }
            }
        }
        return s1;
    }


    public static void main(String[] args) {
        String s="ababab";
        System.out.println(longestPrefix(s));
    }
}
