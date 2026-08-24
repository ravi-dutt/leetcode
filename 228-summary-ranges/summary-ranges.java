class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ll = new LinkedList<>();
        int i = 0;
        while (i < nums.length) {
            int j = i;
            while (j + 1 < nums.length && nums[j] + 1 == nums[j + 1]) {
                j++;
            }
            if (i == j) {
                ll.add("" + nums[i]);
            }
            else {
                ll.add(nums[i] + "->" + nums[j]);
            }
            i = j + 1;
        }
        return ll;
    }
}