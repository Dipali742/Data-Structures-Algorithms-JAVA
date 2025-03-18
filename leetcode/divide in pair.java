class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        boolean[] numsCount = new boolean[501];
        int i = 0;
        while(i < n) {
            numsCount[nums[i]] = !numsCount[nums[i]];
            i++;
        }

        i = 0;
        while(i < 501) {
            if(numsCount[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}




class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        int[] numsCount = new int[501];
        int i = 0;
        while(i < n) {
            numsCount[nums[i]]++;
            i++;
        }

        i = 0;
        while(i < 501) {
            if(numsCount[i] % 2 != 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}