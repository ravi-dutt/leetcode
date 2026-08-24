class Solution {
    public int[] sortedSquares(int[] nums) {
        int k=0;
        for(int num:nums)
        {
          nums[k]=num*num;
          k++;
        }
        Arrays.sort(nums);
        return nums;
    }
}