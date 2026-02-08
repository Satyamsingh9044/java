import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reverse {
    public static void Rev(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
          s.add(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Rev(q);
    }
}
