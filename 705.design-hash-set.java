/*
 * @lc app=leetcode id=705 lang=java
 *
 * [705] Design HashSet
 */

// @lc code=start
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
class MyHashSet {
    public LinkedList<Integer>[] list = new LinkedList[2048];
    int mask = 0x7ff;
    public MyHashSet() {
        for (int i = 0; i < list.length; i++) {
            list[i] = new LinkedList<>();
        }
    }
    
    public void add(int key) {
        int hashValue = key & mask;
        LinkedList<Integer> l = list[hashValue];
        for (int i = 0; i < l.size(); i++) {
            if(l.get(i)== key){
                return;
            }
        }
        l.add(key);
    }
    
    public void remove(int key) {
         int hashValue = key & mask;
        LinkedList<Integer> l = list[hashValue];
        for (int i = 0; i < l.size(); i++) {
            if(l.get(i)== key){
                l.remove(i);
                return;
            }
        }   
    }
    
    public boolean contains(int key) {
        int hashValue = key & mask;
        LinkedList<Integer> l = list[hashValue];
        for (int i = 0; i < l.size(); i++) {
            if(l.get(i)== key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
// @lc code=end

