public class Addll {
    
}
//LC-2 whenever we have to return a new linked list we should use dummy node method(because it make code clear and easier)
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummy=new ListNode(0);
//         ListNode curr=dummy;
//         int carry=0;
//         while(l1!=null||l2!=null){
//             int sum=carry;
//            if(l1!=null) sum=sum+l1.val;
//            if(l2!=null) sum=sum+l2.val;
//            ListNode newNode=new ListNode(sum%10);
//            carry=sum/10;
//            curr.next=newNode;
//            curr=curr.next;
//            if(l1!=null) l1=l1.next;
//            if(l2!=null) l2=l2.next;
//         }
//         if(carry==1){
//             ListNode newNode=new ListNode(1);
//             curr.next=newNode;
//             newNode.next=null;
//         }
//         return dummy.next;
//     }
// }
