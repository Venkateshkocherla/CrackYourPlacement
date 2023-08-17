class DeleteDuplicates{
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode nll = new ListNode(head.val);
        ListNode temp = head;
        ListNode temp1 = nll;
        while(temp!=null){
            if(temp1.val!=temp.val){
                temp1.next = temp;
            temp1 = temp1.next;
            }
            temp = temp.next;
            
        }
        temp1.next = null;
        return nll;
    }
}