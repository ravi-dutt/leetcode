class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer>hs=new HashSet<>();
        for(int nums:arr)
        {
          if(hs.contains(nums*2)||(hs.contains(nums/2)&&nums%2==0))
          {
            return true;
          }
          hs.add(nums);
        }
        return false;
    }
}