//lc-1807. Evaluate the Bracket Pairs of a String
// first used String so with string the time complexity was O(n^2)
//then used StringBuilder to reduce the time complexity to O(n)


class BraketPair {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder result=new StringBuilder();
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                i++;
                StringBuilder temp=new StringBuilder();
                while(s.charAt(i)!=')'){
                    temp.append(s.charAt(i));
                    i++;
                }
                String key=temp.toString();
                result.append(map.containsKey(key)? map.get(key):"?");
            }else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}