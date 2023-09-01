/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
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
    public ListNode reverseList1(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = null;
        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;

    }

    public ListNode reverseList(ListNode head){
        if(head == null){
            return null;
        }
        ListNode newHead = head;
        while(head.next != null){
            newHead = reverseList(newHead.next);
            head.next.next = head;
            head.next = null;
        }
        return newHead;
    }

    
}
// @lc code=end

