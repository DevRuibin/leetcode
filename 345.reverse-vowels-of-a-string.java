/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char [] res = s.toCharArray();
        while(i < j){
            while(i < j && !isVowel(res[i])) i++;
            while(i < j && !isVowel(res[j])) j--;
            char temp = res[i];
            res[i++] = res[j];
            res[j--] = temp;
        }
        return new String(res);
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
// @lc code=end

