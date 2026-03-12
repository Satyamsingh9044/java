 public class RotateList { //lc-61
    public static  ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) return head;
        ListNode temp1=head;
        ListNode temp2=head;
        int length=1;
        while(temp1.next!=null){
            temp1=temp1.next;
            length++;
        }
        k=k%length;
        if(k==0) return head;
        int i=1;
        while(i<length-k){
            temp2=temp2.next;
            i++;
        }
        ListNode temp3=temp2.next;
        temp2.next=null;
        temp1.next=head;
        head=temp3;
        return head;
    }
}