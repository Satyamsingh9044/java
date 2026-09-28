//lc-1614. Maximum Nesting Depth of the Parentheses

import java.util.*;
class MaxNestingDepth {
    public int maxDepth(String s) {
        int ans=0;
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                s1.push('(');
            ans=Math.max(ans,s1.size());
            }
            if(c==')') s1.pop();

            }
        return ans;
        }
    }
