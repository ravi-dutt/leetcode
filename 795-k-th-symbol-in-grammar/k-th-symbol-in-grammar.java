class Solution {
    public int help(int n,int k,int flip)
    {
        if(n==1)
        {
            return flip%2==0?0:1;
        }
        if(k%2==0)
        {
            return help(n-1,k/2,flip+1);
        }
        return help(n-1,(k+1)/2,flip);
    }
    public int kthGrammar(int n, int k) {
        return help(n,k,0);
    }
}