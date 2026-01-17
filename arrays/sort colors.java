//straight forward solution using counting sort
class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                red++;
            } else if(nums[i] == 1) {
                white++;
            } else {
                blue++;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            while(red > 0) {
                nums[i] = 0;
                i++;
                red--;
            }
            while(white > 0) {
                nums[i] = 1;
                i++;
                white--;
            }
             while(blue > 0) {
                nums[i] = 2;
                i++;
                blue--;
            }
        }
    }
}


//Dutch national flag - one pass solution
class Solution {
    public void sortColors(int[] nums) {
       int low = 0;
       int mid = 0;
       int high = nums.length - 1;

       while(mid <= high) {
          if(nums[mid] == 2) {
            swap(nums, mid, high);
            high--;
          } else if(nums[mid] == 0) {
            swap(nums, mid, low);
            low++;
            mid++;
          } else if(nums[mid] == 1) {
            mid++;
          }
       }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
