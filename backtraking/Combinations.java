import java.util.*;//lc-77
public class Combinations {

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new  ArrayList<>();
        backtrack(n,k,1,list,result);
        return result;
    }

    public static  void backtrack(int n,int k,int idx,List<Integer>list,List<List<Integer>> result){
        if(list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<=n;i++){
            list.add(i);
            backtrack(n,k,i+1,list,result);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        int n=4,k=2;
        System.out.println(combine(n,k));
    }
}
