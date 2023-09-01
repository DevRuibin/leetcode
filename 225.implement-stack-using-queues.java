/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Queue;
/*
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        while(!this.q1.isEmpty()){
            this.q2.add(this.q1.poll());
        }
        this.q1.add(x);
        while(!this.q2.isEmpty()){
            this.q1.add(this.q2.poll());
        }
    }
    
    public int pop() {
        return this.q1.poll();
    }
    
    public int top() {
        return this.q1.peek();
    }
    
    public boolean empty() {
        return this.q1.isEmpty();
    }
}
*/

class MyStack{
    Queue<Integer> q1;

    public MyStack(){
        q1 = new ArrayDeque<>();
    }

    public void push(int x){
        q1.add(x);
        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q1.add(q1.poll());
        }
    }

    public int pop(){
        return q1.poll();
    }

    public int top(){
        return q1.peek();
    }

    public boolean empty(){
        return q1.isEmpty();
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

