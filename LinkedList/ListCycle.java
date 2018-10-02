/**
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.

Example :

Input : 

                  ______
                 |     |
                 \/    |
        1 -> 2 -> 3 -> 4

Return the node corresponding to node 3.

Definition for singly-linked list.
**/
public class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class Solution {
    public ListNode detectCycle(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;
        while(slow != null && fast != null){
            slow = slow.next;
            if(fast.next == null )
                return null;
           else 
                fast = (fast.next).next;
           if(slow == fast)
                break;
        }
        if(slow == null || fast == null)
            return null;
        ListNode curr = A;
        while(curr != slow){
            curr = curr.next;
            slow = slow.next;
        }
        return curr;
    }
}
