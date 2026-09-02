class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>al=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            min=Math.min(min,arr[i]-arr[i-1]);
        }
         for(int i=1;i<arr.length;i++)
         {
            int diff=arr[i]-arr[i-1];
            if(diff==min)
            {
                al.add(Arrays.asList(arr[i-1],arr[i]));
            }
         }
        return al;
    }
}