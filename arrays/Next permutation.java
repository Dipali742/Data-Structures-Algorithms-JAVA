class Solution {
    public void nextPermutation(int[] nums) {
        Boolean possible = false;
        int len =  nums.length;

        //find pivot to swap when larger is at left side and smaller at right
        int pivot = len - 1;
        for(int i = len - 1; i > 0; i--) {
            if(nums[i] > nums[i-1]) {
                pivot = i-1;
                break;
            }
        }


        //swap pivot element with one which is larger from end
        for(int i = len - 1; i > pivot; i--) {
            if(nums[i] > nums[pivot]) {
                possible = true;
                swap(nums, i, pivot);
                break;
            }
        }

        //reverse remaining array
        if(!possible) {
            reverse(nums, 0);
        } else {
            reverse(nums, pivot + 1);
        }
    }

    private void reverse(int[] nums, int pivot) {
        int l = pivot;
        int r = nums.length - 1;
        while(l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
