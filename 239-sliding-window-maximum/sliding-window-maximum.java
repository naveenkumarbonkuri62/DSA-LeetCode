class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && dq.peek()<i-k+1) dq.poll();
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            } 
            dq.offer(i); //insert rear
            if(i>=k-1) result[i-k+1] = nums[dq.peek()]; //i-k+1=0  => i>=k-1

            
        }
        return result;
        
    }
}