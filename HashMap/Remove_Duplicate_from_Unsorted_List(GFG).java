class Solution
{
    public Node removeDuplicates(Node head) 
    {
         Node temp = head;
         Node ansHead = null;
         Node ansTail = null;
         HashMap<Integer,Integer> map = new HashMap<>();
         while(temp!=null){
             map.put(temp.data,map.getOrDefault(temp.data,0)+1);
             if(map.get(temp.data)==1){
                 if(ansHead==null){
                 ansHead = temp;
                 ansTail = temp;
                 }
             else{
                 ansTail.next = temp;
                 ansTail = ansTail.next;
             }
         }
             temp=temp.next;
         }
         ansTail.next = null;
         return ansHead;
    }
}
