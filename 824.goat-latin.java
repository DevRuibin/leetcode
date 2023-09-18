/*
 * @lc app=leetcode id=824 lang=java
 *
 * [824] Goat Latin
 */

// @lc code=start
class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder res = new StringBuilder();
        StringBuilder word = new StringBuilder();
        char headChr = '+';
        int wordCount = 0;
        boolean newWord = true;
        for (int i = 0; i < sentence.length() + 1; i++) {
            if(i == sentence.length() || !isLeter(sentence.charAt(i))){
                if(headChr != '+'){
                    word.append(headChr);
                }
                word.append("ma");
                for (int j = 0; j < wordCount; j++) {
                    word.append('a');
                }
                if(i!= sentence.length()) word.append(' ');
                res.append(word);
                word.delete(0, word.length());
                newWord = true;
                continue;
            }
            char cAtI = sentence.charAt(i);
            if(newWord){
                wordCount++;
                if(!isVowel(cAtI)){
                    headChr = cAtI;
                }else{
                    headChr = '+';
                    word.append(cAtI);
                }
                newWord = false;
            }else{
                word.append(cAtI);
            }
        }
        return res.toString();

    }


    private boolean isVowel(char c){
        switch (c){
            case 'a', 'e', 'i', 'o', 'u',
                 'A', 'E', 'I', 'O', 'U':
                 return true;
            default: return false;
        }
    }


    private boolean isLeter(char c){
        if(c >='a' && c <= 'z') return true;
        if(c >='A' && c <= 'Z') return true;
        return false;
    } 
}
// @lc code=end

