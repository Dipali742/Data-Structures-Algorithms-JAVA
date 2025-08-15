class Solution {
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];
        for(int num: nums) {
            smallest = smallest > num ? num : smallest;
            largest = largest < num ? num : largest;
        }
        if(smallest == largest)
            return smallest;

        int sqrtSmallest = (int)Math.sqrt(smallest);
        int gcd = 1;
        for(int i = 1; i <= sqrtSmallest; i++) {
            if(smallest % i == 0 && largest % i == 0 && gcd < i) {
                gcd = i;
            }

            int smallestPair = smallest/i;
            
            if(smallest % smallestPair == 0 && largest % smallestPair == 0 && gcd < smallestPair) {
                gcd = smallestPair;
            }
        }
        return gcd;
    }
}