/*
An Armstrong number (also known as a narcissistic number) is a number 
    that is equal to the sum of its digits each raised to the power of the number of digits.
e.g => 371 = 3^3 + 7^3 + 1^3
9474 => 9^4 + 4^4 + 7^4 + 4^4
*/

class Solution {
    public boolean isArmstrong(int n) {
        int arm = 0;
        int org = n;
        int length = (int) Math.log10(n) + 1;
        while(n != 0) {
            int mod = n%10;
            n/=10;
            arm += (int)Math.pow(mod, length);
        }
        return arm == org;
    }
}