class Solution {
    public int getDecimalValue(ListNode head) {
        int count=0,res=0;
        ListNode prev=null;
        int powTwo=1;
        while(head!=null){
            ListNode nextNode=head.next;
            head.next=prev;
            prev=head;
            head=nextNode;
        }
        while(prev!=null){
            res+=prev.val*powTwo;
            powTwo*=2;
            prev=prev.next;
        }
        return res;
    }
}