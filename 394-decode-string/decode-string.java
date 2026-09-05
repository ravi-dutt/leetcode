class Solution {
    public String decodeString(String s) {
        Stack<String>str=new Stack<>();
        Stack<Integer>it=new Stack<>();
        int count=0;
        String s1=new String();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='0'&&c<='9')
            {
                count=10*count+(c-'0');
            }
            else if(c=='[')
            {
                str.push(s1);
                it.push(count);
                s1="";
                count=0;
            }
            else if(c==']')
            {
                String s2=str.pop();
                int n=it.pop();
                StringBuilder st=new StringBuilder();
                st.append(s2);
                for(int j=0;j<n;j++)
                {
                    st.append(s1);
                }
                s1=st.toString();
            }
            else
            {
                s1=s1+Character.toString(c);
            }
        }
        return s1;
    }
}