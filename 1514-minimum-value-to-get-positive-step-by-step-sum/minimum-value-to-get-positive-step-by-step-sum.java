class Solution {
    public int minStartValue(int[] nums) {
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
            min=Math.min(nums[i],min);
        }
        if(min>=1) return 1;
        return 1-min;  
    }
}