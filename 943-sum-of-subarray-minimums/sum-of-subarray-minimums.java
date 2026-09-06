class Solution {
    public int sumSubarrayMins(int[] arr) {
           int []p=new int[arr.length];
        int []n=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            p[i]=-1;
            n[i]=arr.length;
        }
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(true)
            {
                if(stack.isEmpty())
                {
                    stack.push(i);
                    break;
                }
                int idx=stack.peek();
                if(arr[i]<=arr[idx])
                {
                    n[idx]=i;
                    stack.pop();
                }
                else
                {
                    stack.push(i);
                    break;
                }
            }
        }
        stack.clear();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(true)
            {
                if(stack.isEmpty())
                {
                    stack.push(i);
                    break;
                }
                int idx=stack.peek();
                if(arr[i]<arr[idx])
                {
                    p[idx]=i;
                    stack.pop();
                }
                else
                {
                    stack.push(i);
                    break;
                }
            }
        }
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int l=i-p[i];
            int r=n[i]-i;
            long cont=(l*r)%1000000007;
            cont=(cont*arr[i])%1000000007;
            sum=(sum+cont)%1000000007;
        }
        return(int)sum;
    }
}