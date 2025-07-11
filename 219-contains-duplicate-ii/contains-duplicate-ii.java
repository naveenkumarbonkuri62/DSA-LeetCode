class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length<2 || k==0) return false;
        int i=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int j=0;j<nums.length;j++){
            if(!hs.add(nums[j])){
                return true;
            }
            if(hs.size()>=k+1) hs.remove(nums[i++]);
        }
        return false;
    }
}