class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character>hs=new HashSet<>();
        int c=0;
        for(int i=0;i<jewels.length();i++)
        {
            hs.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++)
        {
            if(hs.contains(stones.charAt(i)))
            {
                  c++;
            }
        }
        return c;
    }
}