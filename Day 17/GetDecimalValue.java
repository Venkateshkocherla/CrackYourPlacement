class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        String res = "";
        while(temp!=null){
            res+=Integer.toString(temp.val);
            temp = temp.next;
        }
        return Integer.parseInt(res,2);
    }
}