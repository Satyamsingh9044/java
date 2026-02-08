import java.util.*;

public class height {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root) {
        if (root == null)
            return 0;
        int lc = count(root.left);
        int rc = count(root.right);
        return lc + rc + 1;
    }

    public static int sum(Node root) {
        if (root == null)
            return 0;
        int lsum = sum(root.left);
        int rsum = sum(root.right);
        return lsum + rsum + root.data;

    }

    // approch 1
    public static int diameter(Node root) { // O(n^2)
        if (root == null)
            return 0;
        int leftdia = diameter(root.left);
        int lefth = height(root.left);
        int rightdia = diameter(root.right);
        int righth = height(root.right);
        int selfdia = lefth + righth + 1;
        return Math.max(selfdia, Math.max(leftdia, rightdia));
    }

    // approch 2 O(n)
    static class Info {
        int dia;
        int ht;

        public Info(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info Diameter2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = Diameter2(root.left);
        Info rightInfo = Diameter2(root.right);
        int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(dia, ht);
    }

    static class Info2 {
        Node node;
        int hd;

        public Info2(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        // Level order
        Queue<Info2> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info2(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            Info2 curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {

                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info2(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info2(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void Klevel(Node root, int level, int k) {
        if (root == null)
            return;
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        Klevel(root.left, level + 1, k);
        Klevel(root.right, level + 1, k);
    }

    public static Node LCA(Node root,int n1,int n2){
        if(root==null) return null;
        if(root.data==n1 || root.data==n2) return root;
        Node leftlca=LCA(root.left, n1, n2);
        Node rightlca=LCA(root.right, n1, n2);
        if(rightlca==null) return leftlca;
        if(leftlca==null) return rightlca;
        return root;
    }

    public static void main(String[] args) {
        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));
        // System.out.println("diameter is : "+ Diameter2(root).dia);//Diameter2 return
        // object but we want its property so (.dia)
        // System.out.println("height is : "+ Diameter2(root).ht);//Diameter2 return
        // object but we want its property so (.ht)
        // topView(root);
        // Klevel(root, 1, 2);
        System.err.println(LCA(root,4,6).data);
    }
}
