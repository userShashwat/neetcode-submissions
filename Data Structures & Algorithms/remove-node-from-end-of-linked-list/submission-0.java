class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nHead = reverse(head);
        int cnt = 1;
        ListNode temp = nHead;
        ListNode prev = null;
        while (cnt < n && temp != null) {
            prev = temp;
            temp = temp.next;
            cnt++;
        }
        if (temp == null) return reverse(nHead); 
        if (prev == null) {
            nHead = temp.next;
        } else {
            prev.next = temp.next;
        }

        temp.next = null;

        return reverse(nHead);
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode nxt = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nxt;
        }
        return prev;
    }
}
