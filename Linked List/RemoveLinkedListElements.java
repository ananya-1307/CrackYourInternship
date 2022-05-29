
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
    ListNode temp = new ListNode(0);
    temp.next = head;
    ListNode ptr = temp;
 
    while(ptr.next != null){
        if(ptr.next.val == val){
            ListNode p = ptr.next;
            ptr.next = p.next; 
        }else{
            ptr = ptr.next;
        }
    }
 
    return temp.next;
        
    }
}