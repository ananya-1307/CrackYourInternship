class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
     
    ListNode p = head;
    int len = 0;
    while(p != null){
        len++;
        p = p.next;
    }
 
   
    int fromStart = len-n+1;
    if(fromStart==1)
        return head.next;
 
     
    p = head;
    int i=0;
    while(p!=null){
        i++;
        if(i==fromStart-1){
            p.next = p.next.next;
        }
        p=p.next;
    }
 
    return head;
        
        
        
    }
}