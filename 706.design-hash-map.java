/*
 * @lc app=leetcode id=706 lang=java
 *
 * [706] Design HashMap
 */

// @lc code=start
import java.util.List;
import java.util.Iterator;

import java.util.LinkedList;
class MyHashMap {
    List<Integer[]>[] list;
    int mask;
    public MyHashMap() {
        int listLen = 2048;
        mask = 0x7ff;
        list = new LinkedList[listLen];
        for (int i = 0; i < listLen; i++) {
            list[i] = new LinkedList<>();
        }
    }
    
    public void put(int key, int value) {
        int hashValue = key & mask;
        List<Integer[]> l = list[hashValue];
        Iterator<Integer[]> iterator = l.iterator();
        while(iterator.hasNext()){
            Integer[] kv = iterator.next();
            if(kv[0]==key){
                kv[1] = value;
                return;
            }
        }
        l.add(new Integer[]{key, value});
        
    }
    
    public int get(int key) {
        int hashValue = key & mask;
        List<Integer[]> l = list[hashValue];
        Iterator<Integer[]> iterator = l.iterator();
        while(iterator.hasNext()){
            Integer[] kv = iterator.next();
            if(kv[0]==key){
                return kv[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int hashValue = key & mask;
        List<Integer[]> l = list[hashValue];
        Iterator<Integer[]> iterator = l.iterator();
        while(iterator.hasNext()){
            Integer[] kv = iterator.next();
            if(kv[0] == key){
                iterator.remove();
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
// @lc code=end

