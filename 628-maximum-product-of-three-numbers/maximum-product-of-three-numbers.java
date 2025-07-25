class Solution {
    public int maximumProduct(int[] nums) {
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        int fmin = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        
        for(int val : nums){
            //updation of max
            if(val > fmax){
                tmax = smax;
                smax = fmax;
                fmax = val;
            } else if(val > smax){
                tmax = smax;
                smax = val;
            } else if(val > tmax){
                tmax = val;
            }
            
            //updation of min
            if(val < fmin){
                smin = fmin;
                fmin = val;
            } else if(val < smin){
                smin = val;
            }
        }
        int p1 = fmax * smax * tmax;
        int p2 = fmax * fmin * smin;
        return Math.max(p1, p2);
    }
}