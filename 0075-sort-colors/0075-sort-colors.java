class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;

        while(mid<=end){
            switch(nums[mid]){
                case 0:
                //swap(nums,start,mid)
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
                break;

                case 1:
                //no swapping
                mid++;
                break;

                case 2:
                //swap(nums,mid,end)
                int temp2 = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp2;
                end--;
                break;
                 
            }
        }
    }
}