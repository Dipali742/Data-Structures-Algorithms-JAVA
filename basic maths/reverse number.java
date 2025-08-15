class Solution {
    public int reverse(int x) {
        int reversed_number = 0;
        while(x != 0) {
            int mod = x%10;
            if(
                reversed_number > Integer.MAX_VALUE/10
                || (reversed_number == Integer.MAX_VALUE && mod > 7)
                ) return 0;
            if(
                reversed_number < Integer.MIN_VALUE/10
                || (reversed_number == Integer.MIN_VALUE && mod < -8)
                ) return 0;
            reversed_number = reversed_number*10 + mod;
            
           
            x/=10;
        }
        return reversed_number;
    }
}

/*

max value of integer : 2^31 - 1 => 2147483647 (that's why mod>7 => to avoid overflow)
min value of integer : -2^31 => -2147483648 (that's why mod<-8 => to avoid overflow)

Time Complexity: O(log(n)). There are roughly log10(n) digits in n.
Space Complexity: O(1).


Note: Max digits possible = 10 digits so time complexity is O(10) => 1
log₁₀(n) ≈ the number of times you can divide n by 10 before you reach 1.
*/