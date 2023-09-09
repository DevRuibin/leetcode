/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new LinkedList<>();
        for(String operation : operations){
            switch(operation){
                case "+": {
                    int first = stack.removeFirst();
                    int second = stack.getFirst();
                    stack.addFirst(first);
                    stack.addFirst(first + second);
                    break;
                }
                case "D":{
                    stack.addFirst(stack.getFirst() * 2);
                    break;
                }
                case "C":{
                    stack.removeFirst();
                    break;
                }
                default: {
                    stack.addFirst(Integer.valueOf(operation));    
                }
            }
        }     
        int sum = 0;
        Iterator<Integer> stackIterator = stack.iterator();
        while(true){
            try{
                sum += stackIterator.next();
            }catch(NoSuchElementException e){
                return sum;
            }
        }
    }
}
// @lc code=end

