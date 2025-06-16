class Solution {
    public int maximumDifference(int[] nums) {

        //Step 1 :Initialization
        int min = nums[0];
        int maxDiff =-1;

        //step 2: Apply Loop and Logic
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min){
                maxDiff = Math.max(maxDiff,nums[i] - min);
            }else{
                min = nums[i];
            }
        }
        //Step 3: Return the result
        return maxDiff;
        
    }
}