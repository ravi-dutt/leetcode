class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i:nums1)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        int res[]= new int[nums1.length];
        int k=0;
        for(int i:nums2)
        {
            if(hm.containsKey(i)&&hm.get(i)>0)
            {
                res[k]=i;
                k++;
                hm.put(i,hm.get(i)-1);
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}