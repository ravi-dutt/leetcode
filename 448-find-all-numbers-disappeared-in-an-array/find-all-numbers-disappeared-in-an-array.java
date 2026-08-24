class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    Set<Integer>hs=new HashSet<>();
    LinkedList<Integer>ll=new LinkedList<>();
    for(int num:nums)
    {
        hs.add(num);
    }
    for(int i=1;i<nums.length+1;i++)
    {
        if(!hs.contains(i))
        {
            ll.add(i);
        }
    }
    return ll;
    }
}