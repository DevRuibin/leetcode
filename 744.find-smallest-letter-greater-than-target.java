/*
 * @lc app=leetcode id=744 lang=java
 *
 * [744] Find Smallest Letter Greater Than Target
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int idex = binarySearch(letters, 0, letters.length-1, target);

        return letters[idex];
    }

    private int binarySearch(char[] letters, int l, int r, char target){
        if(l > r) return l < letters.length ? l : 0;
        //if(l < r){
          //  while(r < letters.length-1){
            //    if(letters[l] > target) return l;
              //  l++;
           // }
            //return -1;
        //}
        int middle = (l + r) / 2;
        if(letters[middle] == target){
            //return middle;
            while(middle < letters.length-1){
                middle++;
                if(letters[middle] > target) return middle;
            }
            return 0;
        }else if(letters[middle] > target){
            return binarySearch(letters, l, middle -1, target);
        }else{
            return binarySearch(letters, middle+1, r, target);
        }
    }
}
// @lc code=end

