class PalindromeList{
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head = head.next;
        }
        int s = al.size();
        for(int i=0;i<s;i++){
            if(al.get(i)!=al.get(s-i-1)){
                return false;
            }
        }
        return true;
    }
}