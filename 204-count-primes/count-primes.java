class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1)
        {
            return 0;
        }
        boolean[]np=new boolean[n];
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(np[i])
            {
                continue;
            }
            for(int j=i*i;j<n;j=j+i)
            {
                np[j]=true;
            }
        }
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(!np[i])
            {
                c=c+1;
            }
        }
        return c;
    }
}