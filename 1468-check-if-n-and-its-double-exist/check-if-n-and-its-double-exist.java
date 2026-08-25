class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        { if(arr[i]==0)
        {
           i++;
        }
            int val =arr[i]*2;
            if(hs.contains(val))
            {
                return true;
            }
        }
        return false;
    }
}