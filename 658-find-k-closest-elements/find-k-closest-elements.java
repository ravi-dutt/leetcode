class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0,
        r=arr.length-1;
        List<Integer>res=new ArrayList<>();
        if(arr.length==k)
        {
            for(int i:arr)
            {
                res.add(i);
            }
            return res;
        }
        while(l<r)
        {
            int m=l+(r-l)/2;
            if(arr[m]>=x)
            {
                r=m;
            }
            else
            {
                l=m+1;
            }
        }
        l=r-1;
        int i=0;
        while(i<k)
        {
            if(r==arr.length)
            {
                l=l-1;
            }
            else if(l==-1)
            {
                r=r+1;
            }
            else if(Math.abs(arr[r]-x)<Math.abs(arr[l]-x))
            {
                r=r+1;
            }
            else
            {
                l--;
            }
            i++;
        }
        for(int j=l+1;j<r;j++)
        {
            res.add(arr[j]);
        }
        return res;
    }
}