ublic class Cycle {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow ==fast){
                return true;
            }
        }
        return false;
    }
}