class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length == 1) {
            list.add(nums[0]);
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i + 1] != nums[i] + 1 &&
                    nums[i + 1] != nums[i]) {
                    list.add(nums[i]);
                }
            }
            else if (i == nums.length - 1) {
                if (nums[i - 1] != nums[i] - 1 &&
                    nums[i - 1] != nums[i]) {
                    list.add(nums[i]);
                }
            }
            else {
                if (nums[i - 1] != nums[i] - 1 &&
                    nums[i - 1] != nums[i] &&
                    nums[i + 1] != nums[i] + 1 &&
                    nums[i + 1] != nums[i]) {
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }
}