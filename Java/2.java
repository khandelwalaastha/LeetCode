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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
             if (l1 == null) return l2;
            if (l2 == null) return l1;
            int carry = 0;
            ListNode curr1 = l1, curr2 = l2;
            while (true) {
                int tempCurrVal = curr1.val;
                curr1.val = (curr1.val + curr2.val + carry) % 10;
                carry = (tempCurrVal + curr2.val + carry) / 10;
                if(curr1.next == null) {
                    curr1.next = curr2.next;
                    break;
                } else if(curr2.next == null) {
                    break;
                }
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            while(carry == 1) {
                if(curr1.next == null) {
                    curr1.next = new ListNode(0);
                }
                int temp = curr1.next.val;
                curr1.next.val =  (curr1.next.val + carry)%10;
                carry = (temp + carry)/10;
                curr1 = curr1.next;
            }
            return l1;
        }
}
