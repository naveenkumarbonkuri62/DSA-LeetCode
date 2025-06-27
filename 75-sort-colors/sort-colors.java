class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            int num = nums[mid];
            if (num == 0) {
                // swap nums[low] and nums[mid]
                nums[mid++] = nums[low];
                nums[low++] = 0;
            } else if (num == 2) {
                // swap nums[mid] and nums[high]
                nums[mid] = nums[high];
                nums[high--] = 2;
            } else {
                mid++; // 1 stays in the middle
            }
        }
    }
}
