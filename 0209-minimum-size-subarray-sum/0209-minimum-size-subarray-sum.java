class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int right = 0;
        int left = 0;
        int sum = 0;
        int minlength = Integer.MAX_VALUE;;

        while(right < nums.length){
            sum = sum + nums[right];
            right++;

        while(sum>=target){
            minlength = Math.min(minlength, right-left);

            sum = sum - nums[left];
            left++;
        }

    }
    return minlength == Integer.MAX_VALUE ? 0 : minlength;
      
      
    }
}
