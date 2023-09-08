/*
 * @lc app=leetcode id=657 lang=java
 *
 * [657] Robot Return to Origin
 */

// @lc code=start
class Solution {
    public boolean judgeCircle(String moves) {
       int verticalCount = 0;
       int horizentialCount = 0;
       for (char ch : moves.toCharArray()) {
            if(ch == 'L'){
                horizentialCount++;
            }else if(ch=='R'){
                horizentialCount--;
            }else if(ch=='U'){
                verticalCount++;
            }else{
                verticalCount--;
            }
       } 
       return verticalCount==0 && horizentialCount == 0;
    }
}
// @lc code=end

