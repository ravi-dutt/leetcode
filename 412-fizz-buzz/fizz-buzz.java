class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>ll=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            String out="";
            if(i%3==0)
            {
                out+="Fizz";
            }
            if(i%5==0)
            {
                out+="Buzz";
            }
            if(out=="")
            {
                out=Integer.toString(i);
            }
            ll.add(out);
        }
        return ll;
    }
}