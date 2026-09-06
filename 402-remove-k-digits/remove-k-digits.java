class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);
            while(true)
            {
                if(k==0)
                {
                    stack.push(ch);
                    break;
                }
                if(stack.isEmpty())
                {
                    stack.push(ch);
                    break;
                }
                char top=stack.peek();
                if(ch<top)
                {
                  stack.pop();
                  k--;
                }
                else
                {
                    stack.push(ch);
                    break;
                }
            }
        }
        while(k>0)
        {
            if(stack.isEmpty())
            {
                break;
            }
            stack.pop();
            k--;
        }
        char[]res=new char[stack.size()];
        int i=res.length-1;
        while(i>=0)
        {
            res[i]=stack.pop();
            i--;
        }
        i=0;
        while(i<res.length&& res[i]=='0')
        {
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(i<res.length)
        {
            sb.append(res[i]);
            i++;
        }
        return sb.length()==0?"0":sb.toString();
    }
}