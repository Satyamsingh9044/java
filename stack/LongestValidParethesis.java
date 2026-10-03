//lc-32. Longest Valid Parentheses

public class LongestValidParethesis {
    public int longestValidParentheses(String s) {
        if(s.length()==0) return 0;
        int n=s.length();
        int open=0;
        int close=0;
        int result=0;
        for(char ch:s.toCharArray()){
            if(open==close){
                result=Math.max(result,(open+close));
            }
            if(open < close){
                open=0;
                close=0;
            }
            if(ch=='('){
                open++;
            }else{
                close++;
            }
        }

        open = 0;
        close = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') open++;
            else close++;

            if (open == close) {
                result = Math.max(result, open + close);
            } else if (open > close) { 
                open = 0;
                close = 0;
            }
        }
        return result;
    }
}
