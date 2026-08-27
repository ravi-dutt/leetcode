class Solution {
    public boolean checkPerfectNumber(int num) {
        int c=0;
        for(int i=1;i<=num/2;i++)
        {
           if(num%i==0)
           {
            c+=i;
           }
        }
        if(c==num)
        {
            return true;
        }
        return false;
    }
}