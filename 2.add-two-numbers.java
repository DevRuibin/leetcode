/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start

//Definition for singly-linked list.
/* 
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode index = result;
        int carry = 0;
        while(true){
            int[] temp = adder(l1.val, l2.val, carry);
            carry = temp[1];
            index.val = temp[0];
            l1 = l1.next;
            l2 = l2.next;
            if(l1 != null && l2 != null){
                index.next = new ListNode();
                index = index.next;
            }else{
                break;
            }
        }
        if(l1 == null && l2 == null){
            if(carry == 1){
                index.next = new ListNode(1);
            }
        }else if(l1 == null){
            index.next = l2;
            while(carry == 1){
                if(l2 == null){
                    index.next = new ListNode(1);
                    carry = 0;
                }else{
                    int[] temp = adder(l2.val, 0, carry);
                    carry = temp[1];
                    l2.val = temp[0];
                    index = index.next;
                    l2 = l2.next;
                    
                }
            }
        }else{
            index.next = l1;
            while(carry == 1){
                if(l1 == null){
                    index.next = new ListNode(1);
                    carry = 0;
                }else{
                    int[] temp = adder(l1.val, 0, carry);
                    carry = temp[1];
                    l1.val = temp[0];
                    index = index.next;
                    l1 = l1.next;
                    
                }
            }
        }
        return result;
    }
    /*  9: 0000 1001
     * 10: 0000 1010
     * 11: 0000 1011
     * 18: 0001 0010
     * 17: 0001 0001
     * 
     */
    public int[] adder(int a, int b, int carryIn){
        int[] result = new int[2];
        int sum = a + b  + carryIn;
        int carry = sum > 9 ? 1 : 0;
        int digit = sum % 10;
        result[0] = digit;
        result[1] = carry;
        return result;
    }
}
// @lc code=end

