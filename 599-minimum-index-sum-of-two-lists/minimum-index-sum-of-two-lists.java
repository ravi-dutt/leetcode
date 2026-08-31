class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String>res=new ArrayList<>();
        Map<String,Integer>hm=new HashMap<>();
        for(int i=0;i<list1.length;i++)
        {
            hm.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++)
        {
            if(hm.containsKey(list2[i]))
            {
                if(i+hm.get(list2[i])<min)
                {
                    min=i+hm.get(list2[i]);
                    res=new ArrayList<>();
                    res.add(list2[i]);
                }
                else if(i+hm.get(list2[i])==min)
                {
                    res.add(list2[i]);
                }
            }
        }
        String []ans=new String[res.size()];
        for(int i=0;i<res.size();i++)
        {
            ans[i]=res.get(i);
        }
        return ans;
    }
}