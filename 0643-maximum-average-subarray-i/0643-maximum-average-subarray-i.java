class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
       for(int i=0; i<k; i++){
        sum = sum+nums[i];
       } 
       int left=0;
       int right=k;
       int maxSum = sum;

       while(right<nums.length){

        sum = sum-nums[left];
        left++;

        sum = sum+nums[right];
        right++;

        maxSum = Math.max(maxSum, sum);

    } 
    return (double) maxSum / k;
    }

}