
public class Solution {
    public boolean hasCycle(ListNode head) {
        int flag=0;
        ListNode temp=head;
        ListNode ptr=head;
        
        while(temp!=null && temp.next!=null)
        {
            ptr=ptr.next;
            temp=temp.next.next;
            
            if(temp==ptr)
            {
                return true;
            }
            
            
        }
      
            return false; 
        
        
        
        
    }
}