class Solution {
    public boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length()-1);
    }

    public boolean isPalindrome(String s, int l, int r) {
        if(r <= l)
            return true;

        if(!isAlphaNumeric(s.charAt(l))) {
            return isPalindrome(s, l+1, r);
        } else if(!isAlphaNumeric(s.charAt(r))) {
            return isPalindrome(s, l, r-1);
        }
        if(getLowerCase(s.charAt(l)) != getLowerCase(s.charAt(r))) {
            return false;
        }
        boolean res = true;
        res = isPalindrome(s, l+1, r-1);
        return res;
    }

    public char getLowerCase(char ch) {
        if(ch >= 'A' && ch <= 'Z')
            return (char)(ch + 32);
        return ch;
    }

    public boolean isAlphaNumeric(char ch) {
        return (
            (ch >= 'A' && ch <= 'Z')
            || (ch >= 'a' && ch <= 'z')
            || (ch >= '0' && ch <= '9')
        );
    }
}