public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class RemoveNthNodeFromEnd{
    public ListNode removeNthFromEnd(ListNode A , int B) { 
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = A;
        ListNode first = dummyNode, second = dummyNode;    
        Boolean end = false;
        while(B > 0){
            if(first.next == null){
                end = true;
                break;
            }
            first = first.next;
            B--;
        }
        if(end){
            A = A.next;
            return A;
        }

        while(first.next != null){
            second = second.next;
            first = first.next;
        }
        if(second.next == A){
            A = A.next;
        } else {
            second.next = second.next.next;
        }
        return A;
    }

}