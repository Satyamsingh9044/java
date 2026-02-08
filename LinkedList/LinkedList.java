public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        newNode.next = head;      
        head=newNode;        
        
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i=idx-1; temp ->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty1");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty1");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        } // prev: i=size-2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int value = prev.next.data;// tail data
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {//iterative approch
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    

    public void deleteNthfromend(int n) {
        // calculating size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        int i = 1;
        int itofind = sz - n;
        Node prev = head;
        while (i < itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // slow-fast approch
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) { // fast for even and fast.next for odd
            slow = slow.next;
            fast = fast.next.next;
        }
        // System.out.println(slow.data);
        return slow; // slow is our mid
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step-1 find mid
        Node midNode = findMid(head);
        // step-2 reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right half head
        Node left = head;// left half head
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void removeCycle() {
        // detect cylce
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false)
            return;
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle last.next=null
        prev.next = null;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// mid
    }

    private Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;
        // find mid
        Node mid = getMid(head);
        // left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge
        return merge(newLeft, newRight);
    }
    public void zigzag(){
        //mid
        Node mid=getMid(head);
        //reverse
        Node curr =mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //alternate merge 
        while(left !=null && right !=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            //update
            left=nextL;
            right=nextR;
        }
    }
    public void deletebyValue(int value){
        if(head.data==value){
            head=head.next;
            return;
        }
        Node temp=head.next;
        Node prev=null;
        while(temp !=null && temp.data!=value){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void deletebyPosition(int idx){
        if(idx==0){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        int i=0;
        while(i<idx){
            prev=temp;
            temp=temp.next;
            i++;
        }
        // prev.next=temp.next;
    prev.next=prev.next.next;
    }


    public int Searchforavalueandreturntheposition(int value){
        if(head.data==value){
            return 0;
        }
        Node temp=head;
        int i=0;
        while(temp!=null && temp.data!=value){
            temp=temp.next;
            i++;
        }
        return i;
    }

    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        // ll.add(2, 9);// 2 index pe 9
        ll.print();// 1->2->2->1->null
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.recSearch(9));
        // System.out.println(ll.itrSearch(10));
        // ll.reverse();
        // ll.deleteNthfromend(5);
        // System.out.println(ll.checkPalindrome());
        // ll.print();
        // head = ll.mergeSort(head);
        // ll.print();
        // ll.zigzag();
        // ll.addFirst(10);
        // ll.deletebyValue(3);
        ll.deletebyPosition(3);
        // System.out.println("the value is found at index : "+ ll.Searchforavalueandreturntheposition(2));
        ll.print(); 
        // O(nlogn) T.C
    }
}