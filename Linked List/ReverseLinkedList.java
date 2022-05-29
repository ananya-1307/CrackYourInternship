
class Solution {
    public ListNode reverseList(ListNode head) 
    {
        ListNode temp=null;
        ListNode ptr=null;
        while(head!=null)
        {
            ptr=head.next;
            head.next=temp;
            temp=head;
            head=ptr;
            
            
            
            
        }
        
        return temp;
        
    }
}