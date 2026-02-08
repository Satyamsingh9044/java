//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
// If they do not intersect, return null.
//LeetCode 160: Intersection of Two Linked Lists.


//Approach 1: Using HashSet
// Complexity:
// Time: O(m + n) → both lists traversed once.
// Space: O(m) → because we store all nodes of list A.


// import java.util.*;
// public class IntersectLL {
    //   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // HashSet<ListNode> set = new HashSet<>();
// 
        // Store all nodes of List A
        // while (headA != null) {
            // set.add(headA);
            // headA = headA.next;
        // }
// 
        // Traverse List B and check
        // while (headB != null) {
            // if (set.contains(headB)) {
                // return headB; // Intersection found
            // }
            // headB = headB.next;
        // }
// 
        // return null; // No intersection
    // }
// }
// 




// The two-pointer solution is preferred since it uses O(1) space and is elegant.
//  The HashSet solution is simpler to understand and implement but uses extra memory.


// Efficient Solution (Two Pointers)
// Use two pointers pA and pB, starting from headA and headB.
// Move each pointer forward.
// If a pointer reaches the end, redirect it to the other list’s head.
// If they intersect, the pointers will eventually meet at the intersection node.
// If not, both will reach null.


// Complexity:
// Time: O(m + n) → each pointer traverses both lists at most once.
// Space: O(1) → no extra memory used.



// public class Solution {
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // if (headA == null || headB == null) return null;
// 
        // ListNode pA = headA;
        // ListNode pB = headB;
// 
        // Traverse until they meet or both become null
       // while (pA != pB) {
          //  If pA reaches the end, switch to headB
            // pA = (pA == null) ? headB : pA.next;
          //  If pB reaches the end, switch to headA
            // pB = (pB == null) ? headA : pB.next;
        // }
// 
        // return pA; // Either intersection node or null
    // }
// }
