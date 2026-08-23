class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int ori=x;
        if(x<0)
        {
            return false;
        }
        while(x!=0){
         int ld=x%10;
           x=x/10;
        sum=sum*10+ld;
        }
        if(ori==sum)
        {
            return true;
        }
        else return false;
    }
}