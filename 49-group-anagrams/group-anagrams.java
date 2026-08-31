class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ls=new ArrayList<List<String>>();
        Map<String,List<String>>hm=new HashMap<>();
        for(String str:strs)
        {
            char[]ch=str.toCharArray();
            Arrays.sort(ch);
            String n=new String(ch);
            if(!hm.containsKey(n))
            {
                hm.put(n,new ArrayList<String>());
            }
            hm.get(n).add(str);
        }
        for(Map.Entry<String,List<String>> e:hm.entrySet())
        {
            ls.add(e.getValue());
        }
        return ls;
    }
}