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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)return null;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode pointer=head;
        while(pointer!=null){
            ListNode rangeTail=check(pointer,k);
            if(rangeTail!=null){
              ListNode next=rangeTail.next;
              rangeTail.next=null;
              ListNode headReversed=reverse(pointer);
              temp.next=headReversed;
              temp=pointer;
              pointer=next;
            }
            else{
                temp.next=pointer;
                break;
            }
           
        }
        return dummy.next;
    }
    public ListNode check(ListNode head,int k){
        int cnt=1;
        ListNode temp=head;
        while(cnt<k){
            if(temp.next == null) return null;
            temp=temp.next;
            cnt++;
        }
        return temp;
    }
    public ListNode reverse(ListNode t){
        ListNode temp=t;
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
