class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int rev = 0;
        int org = x;
        while(org != 0) {
            int mod = org%10;
            rev = rev*10 + mod;
            org/=10;
        }
        return rev == x;
    }
}