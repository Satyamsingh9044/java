public class doublyll {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("dll is empty");
        }
         if (head.next == null) {
            // Only one element
            head = tail = null;
         }else{

             head=head.next;
             head.prev=null;
            }
    }
    public void removeLast(){
        tail=tail.prev;
    }
    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        doublyll dll=new doublyll();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.removeFirst();
        // dll.removeLast();
        dll.print();
    }
}
