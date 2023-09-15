/*
 * @lc app=leetcode id=819 lang=java
 *
 * [819] Most Common Word
 */

// @lc code=start

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        Set<String> bannedWords = new HashSet<>();
        String newParagraph = paragraph.toLowerCase();
        Pattern pattern = Pattern.compile("[ !?',;\\.]+");
        String[] words = pattern.split(newParagraph);
        int i = 0;
        int maxIndex = -1;
        for (String string : banned) {
            bannedWords.add(string);
        }
        for (String word : words) {
            if(bannedWords.contains(word)){
                i++;
                continue;
            }
            int count = map.getOrDefault(word, 0) + 1;
            map.put(word, count);
            if(max < count) {
                max = count;
                maxIndex = i;
            }
            i++;
        }
        return words[maxIndex];
        
        
    }
}
// @lc code=end

