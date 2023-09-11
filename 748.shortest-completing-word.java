/*
 * @lc app=leetcode id=748 lang=java
 *
 * [748] Shortest Completing Word
 */

// @lc code=start

// this question can use int array to replace map
import java.util.Map;

import java.util.Iterator;

import java.util.HashMap;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            char chr = toLowerCaseOrIgnore(licensePlate.charAt(i));
            if(chr == (char)1) continue;
            map.put(chr, map.getOrDefault(chr, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        Map<Character, Integer> mapWord = new HashMap<>();
        flag:
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.length() < map.size()) continue;
            if(word.length() >= min) continue;
            for (int j = 0; j < word.length(); j++) {
                char chrAtJ = toLowerCaseOrIgnore(word.charAt(j));
                if(chrAtJ == (char)1) continue;
                mapWord.put(chrAtJ, mapWord.getOrDefault(chrAtJ, 0) + 1);
            }
            Iterator<Character> iterator = map.keySet().iterator();
            while(iterator.hasNext()){
                char k = iterator.next();
                if(map.get(k) > mapWord.getOrDefault(k, 0)){
                    mapWord.clear();
                    continue flag;
                }
            }
            //if(word.length() < min){
                min = word.length();
                minIndex = i;
            //}
            mapWord.clear();;
        }        
        return words[minIndex];
    }

    private char toLowerCaseOrIgnore(char c){
            if(c >= 'a' && c <= 'z'){
                // do no operation
            }else if(c >= 'A' && c <= 'Z'){
                c = (char)(c - (char)('A' - 'a'));
            }else{
                c = (char)1;
            }
            return c;
    }
}
// @lc code=end

