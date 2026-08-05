import java.util.LinkedList;
import java.util.Queue;
public class nonrepletter{
    public static void printNonRepeating(String str){
        int freq[]=new int[26];
         Queue<Character> q = new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty()&& freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str="aabccxb";
        printNonRepeating(str);
    }
}

//using freq array

// class Solution {
//     public int firstUniqChar(String s) {
//         int freq[]=new int[26];
//         for(int i=0;i<s.length();i++){
//             freq[s.charAt(i)-'a']++;
//         }
//         for(int i=0;i<s.length();i++){
//             if(freq[s.charAt(i)-'a']==1) return i;
//         }
//         return -1;
//     }
// }

//using hashmap
// class Solution {
//     public int firstUniqChar(String s) {
//       char st[]=s.toCharArray();
//       HashMap<Character,Integer>map=new HashMap<>();
//       for(char c:st){
//         map.put(c,map.getOrDefault(c,0)+1);
//       }
//         for (int i = 0; i < st.length; i++) {
//             if (map.get(st[i]) == 1) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

//using queue

// class Solution {
//     public int firstUniqChar(String s) {
//         int[] freq = new int[26];
//         Queue<Integer> queue = new LinkedList<>();
        
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
            
//             // Step 1: Increase frequency
//             freq[c - 'a']++;
            
//             // Step 2: Add index to queue
//             queue.offer(i);
            
//             // Step 3: Remove invalid characters
//             while (!queue.isEmpty() && freq[s.charAt(queue.peek()) - 'a'] > 1) {
//                 queue.poll();
//             }
//         }
        
//         // Step 4: Result
//         return queue.isEmpty() ? -1 : queue.peek();
//     }
// }