class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
           int k=queries[i][0];
           int trim=queries[i][1];
           List<Pair<String,Integer>>list=new ArrayList<>();
           for(int j=0;j<nums.length;j++)
           {
            int sub=nums[j].length()-trim;
            list.add(new Pair<String,Integer>(nums[j].substring(sub),j));
           }
           Collections.sort(list, (a,b) -> a.getKey().compareTo(b.getKey()));
           Pair<String, Integer>ele=list.get(k-1);
           res[i]=ele.getValue();        
        }
        return res;
    }
}