/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */


import java.util.Deque;
import java.util.LinkedList;



class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c != '#'){
                stack.addFirst(c);
            }else{
                if(stack.isEmpty()) continue;
                stack.removeFirst();
            }
        }

        Deque<Character> stack1 = new LinkedList<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(c != '#'){
                stack1.addFirst(c);
            }else{
                if(stack1.isEmpty()) continue;
                stack1.removeFirst();
            }
        }
        int siz = stack.size();
        if(stack.size() != stack1.size()) return false;
        for (int i = 0; i < siz; i++) {
            if (stack.removeFirst() != stack1.removeFirst()){
                return false;
            }
        }
        return true;
    }
}
