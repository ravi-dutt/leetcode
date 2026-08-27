class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i=s.length()-1;
        int c=0;
        if(s.length()==0)
        {
            return 0;
        }
        while(i>=0&&s.charAt(i)!=' ')
        {
            c++;
            i--;
        }
        return c;
    }
}