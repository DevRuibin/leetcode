/*
 * @lc app=leetcode id=551 lang=java
 *
 * [551] Student Attendance Record I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        //String sortedString = quickSort(s);
        int countA = 0;
        int countL = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'A'){
                countA++;
                if(countA > 1) return false;
                countL = 0;
            }else if(c == 'P'){
                countL = 0;
            } else if(c == 'L'){
                countL++;
                if(countL > 2) return false;
            }
        }
        return true;
        
    }

    private String quickSort(String s){
        char[] chars = s.toCharArray();
        quickSort(chars, 0, chars.length);
        return new String(chars);
    }

    private void quickSort(char[] chars, int start, int end){
        if(start >= end) return;
        int pivot = partition(chars, start, end);
        quickSort(chars, start, pivot);
        quickSort(chars, pivot + 1, end);
    }

    private int partition(char[] chars, int start, int end){
        int pivot = start;
        int i = start + 1;
        int j = end - 1;
        while(i <= j){
            while(i <= j && chars[i] <= chars[pivot]) i++;
            while(i <= j && chars[j] >= chars[pivot]) j--;
            if(i < j){
                swap(chars, i, j);
            }
        }
        swap(chars, pivot, j);
        return j;
    }

    private void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }


}
// @lc code=end

