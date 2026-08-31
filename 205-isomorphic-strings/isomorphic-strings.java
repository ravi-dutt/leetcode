class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>hm1=new HashMap<>();
          Map<Character,Character>hm2=new HashMap<>();
          for(int i=0;i<s.length();i++)
          {
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if(!hm1.containsKey(s1)&&!hm2.containsKey(t1))
            {
                hm1.put(s1,t1);
                hm2.put(t1,s1);
            }
            else if(hm1.get(s1)==null)
            {
                return false;
            }
            else if(hm2.get(t1)==null)
            {
                return false;
            }
            else if(hm1.get(s1)!=t1&&hm2.get(t1)!=s1)
            {
                return false;
            }
          }
          return true;
    }
}