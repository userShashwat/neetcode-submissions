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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        int  len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        int half=0;
        while(half<(len - 1) / 2){
            half++;
            temp=temp.next;
        }
        ListNode l2=reverse(temp.next);
        temp.next=null;
        ListNode l1=head;
        while(l2 != null && l1 != null){
            ListNode t1=l1.next,t2=l2.next;
            l1.next=l2;
            l2.next=t1;
            l1=t1;
            l2=t2;
        }
       
        
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
          ListNode front=temp.next;
          temp.next=prev;
          prev=temp;
          temp=front;
       }
       return prev;
    }
}
