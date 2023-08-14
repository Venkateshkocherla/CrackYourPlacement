class ReverseList{
    public ListNode reverseList(ListNode head) {
        if((head==null)||(head.next==null)){
            return head;
        }
        ListNode p = head;
        ListNode q = p.next;
        ListNode r = q.next;
        while(q!=null){
            q.next = p;
            p = q;
            q = r;
            if(r!=null){
             r= r.next;   
            }
            
        }            
        head.next = null;
        head = p;
        return p;
    }
}