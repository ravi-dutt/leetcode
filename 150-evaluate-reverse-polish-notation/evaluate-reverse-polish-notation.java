class Solution {
    public int evalRPN(String[] tokens) {
        String t="+-/*";
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            String tok=tokens[i];
            if(t.contains(tok))
            {
                int op2=stack.pop();
                int op1=stack.pop();
                int val=0;
                switch(tok)
                {
                    case"+":
                    val=op1+op2;
                    break;
                    case"-":
                    val=op1-op2;
                    break;
                    case"*":
                    val=op1*op2;
                    break;
                    case"/":
                    val=op1/op2;
                    break;
                }
                stack.push(val);
            }
            else
            {
                stack.push(Integer.parseInt(tok));
            }
        }
        return stack.peek();
    }
}