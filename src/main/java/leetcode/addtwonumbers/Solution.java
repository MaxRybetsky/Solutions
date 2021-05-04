package leetcode.addtwonumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = null;
        ListNode current = null;
        int over = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + over;
            over = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum, null);
            if (current != null) {
                current.next = temp;
            }
            current = temp;
            if (first == null) {
                first = current;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (over != 0) {
            current.next = new ListNode(1, null);
        }
        return first;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        new Solution().addTwoNumbers(l1, l2);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
