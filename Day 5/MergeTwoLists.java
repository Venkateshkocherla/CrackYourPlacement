/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeTwoLists{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode n = new ListNode(1);
        ListNode temp3 = n;
        if(list1!=null && list2!=null){
            while(temp1!=null && temp2!=null){
                if(temp1.val>=temp2.val){
                    n.next = temp2;
                    temp2 = temp2.next;
                    n = n.next;
                }
                else{
                    n.next = temp1;
                    temp1 = temp1.next;
                    n = n.next;
                }
        }
        if(temp1!=null){
            n.next = temp1;
        }
        if(temp2!=null){
            n.next = temp2;
        }
         return temp3.next;
        }
        if(temp1==null && temp2!=null){
            return temp2;
        }
        else{
            return temp1;
        }
        
    }
}