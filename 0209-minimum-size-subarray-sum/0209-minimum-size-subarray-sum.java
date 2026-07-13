class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;

        for(right=0; right<nums.length; right++){
            sum = sum + nums[right];

            while(sum>=target){

                minlen = Math.min(minlen, right-left+1);
                
                sum = sum - nums[left++];


            }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}