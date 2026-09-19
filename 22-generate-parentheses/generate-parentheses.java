class Solution {
    public boolean isValid(String s)
    {
        int c=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                c++;
            }
            else
            {
                c--;
            }
            if(c<0)
            {
                return false;
            }
        }
        return c==0;
    }
    public void helper(String curr,int n,List<String>res )
    {
        if(curr.length()==2*n)
        {
            if(isValid(curr))
            {
                res.add(curr);
            }
            return;
        }
        helper(curr+"(",n,res);
        helper(curr+")",n,res);
    }
    public List<String> generateParenthesis(int n) {
        List<String>res =new ArrayList<>();
        helper("",n,res);
        return res;
    }
}