
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
            
        }
        if(c%2!=0)
        {
        ListNode t=head;
        int cc=0;
        while(t!=null)
        {
            cc++;
            if(cc==c/2+1)
            {
                return t;
            }
            t=t.next;
            
        }
            
            

        }
        else
        {
        ListNode t=head;
        int cc=0;
        while(t!=null)
        {
            cc++;
            if(cc==(c/2)+1)
            {
                return t;
            }
            t=t.next;
            
        }
            
        }
        return temp;
        
    }
}