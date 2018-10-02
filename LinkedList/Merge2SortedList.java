public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Merge2SortedList {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A == null) return B;
        if(B == null) return A;
        
        ListNode head = null;
        if(A.val <= B.val){
            head = A;
            A = A.next;
        } else {
            head = B;
            B = B.next;
        }
        ListNode iter = head;
        while(A != null && B != null){
            if(A.val <= B.val){
                iter.next = A;
                A = A.next;
            } else {
                iter.next = B;
                B = B.next;
            }
            iter = iter.next;
        }
        if(A == null)
            iter.next = B;
        else 
            iter.next = A;
        return head;
    }
}