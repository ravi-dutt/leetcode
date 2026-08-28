class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minlen=strs[0].length();
        for(int i=0;i<strs.length-1;i++)
        {
           String f=strs[i];
           String s=strs[i+1];
           int min=Math.min(strs[i].length(),strs[i+1].length());
           int j=0;
           while(j<min)
           {
            if(f.charAt(j)!=s.charAt(j))
            {
                break;
            }
            j++;
           }
           minlen=Math.min(minlen,j);
        }
        return strs[0].substring(0,minlen);
    }
}