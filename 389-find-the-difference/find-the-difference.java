class Solution {
    public char findTheDifference(String s, String t) {
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
        for(int i=0;i<t.length();i++)
        {
             char ch=t.charAt(i);
            if(hs.containsKey(ch))
            {
               hs.put(ch,hs.get(ch)-1);
               if(hs.get(ch)==0)
               {
                hs.remove(ch);
               }
            }
            else
            {
                return ch;
            }
        }
        return ' ';
    }
}