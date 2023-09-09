class SortLinkedList
{
    public Node sort(Node head)
    {
    
        Node temp = head;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(temp != null)
        {
            list.add(temp.data);
            temp = temp.next;
        }
        
        Collections.sort(list);
        temp = head;
        
        for(int val : list)
        {
            temp.data = val;
            temp = temp.next;
        }
        
        return head;
    }
}