/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            
            int remain = (columnNumber-1) % 26;
            columnNumber = (columnNumber -1)/ 26;
            System.out.println("remain: " + remain);
            sb.append(NumToChar(remain));
        }
        return sb.reverse().toString();

    }
    char NumToChar(int num){
        return (char)(num + 'A');
    }
}
// @lc code=end

