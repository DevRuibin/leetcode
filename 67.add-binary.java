/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int maxLen = Math.max(aLen, bLen);
        char[] res = new char[maxLen+1];
        char carry = '0';
        if(aLen < maxLen){
            a = "0".repeat(maxLen-aLen) + a;
        }else if(bLen < maxLen){
            b = "0".repeat(maxLen-bLen) + b;
        }
        for (int i = maxLen-1; i >= 0; i--) {
            char aChar= a.charAt(i);
            char bChar = b.charAt(i);
            char[] adderRes = adder(aChar, bChar, carry);
            res[i+1] = adderRes[0];
            carry = adderRes[1];
        }
        
        if(carry == '1'){
            res[0] = '1';
            return new String(res);
        }else{
            return new String(res, 1, maxLen);
        }
    }

    char[] adder(char a, char b, char carryIn){
        char sum = xor(xor(a, b), carryIn);
        char carryOut = or(and(a, b), or(and(a, carryIn), and(b, carryIn)));
        return new char[]{sum, carryOut};
    }

    private char xor(char a, char b){
        if(a == b) return '0';
        else return '1';
    }

    private char and(char a, char b){
        if(a == '1' && b == '1') return '1';
        else return '0';
    }

    private char or(char a, char b){
        if(a == '1' || b == '1') return '1';
        else return '0';
    }
}
// @lc code=end

