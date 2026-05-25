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

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode t: lists){
            if (t != null) q.add(t);
        }
        ListNode dummy=new ListNode(0);
        ListNode head=dummy;
        while(!q.isEmpty()){
            ListNode temp=q.remove();
            head.next=temp;
            head=head.next;
            if(temp.next!=null){
                q.add(temp.next);
            }
        }
        return dummy.next;
        
    }
}
