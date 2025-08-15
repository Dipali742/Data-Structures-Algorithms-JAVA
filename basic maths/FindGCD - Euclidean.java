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

        while(smallest > 0) {
            int temp = smallest;
            smallest = largest%smallest;
            largest = temp;
        }
        return largest;
    }
}