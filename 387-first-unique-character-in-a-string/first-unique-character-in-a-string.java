class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>hs=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(hs.containsKey(ch))
            {
                hs.put(ch,hs.get(ch)+1);
            }
            else
            {
                hs.put(ch,1);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(hs.get(s.charAt(i))==1)
            {
               return i;
            }
        }
        return -1;
    }
}