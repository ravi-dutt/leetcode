class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>h1=new HashSet<>();
        Set<Integer>h2=new HashSet<>();
        for(int n:nums1)
        {
            h1.add(n);
        }
        for(int n:nums2)
        {
            h2.add(n);
        }
        int res[]=new int[nums1.length];
        int k=0;
        for(int n:h1)
        {
            if(h2.contains(n))
            {
                res[k]=n;
                k++;
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}