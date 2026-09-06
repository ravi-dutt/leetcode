class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Stack<Integer>stack=new Stack<>();
      for(int i=0;i<asteroids.length;i++)
      {
        int as=asteroids[i];
        while(true)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
                break;
            }
            if(as>=0)
            {
                stack.push(i);
                break;
            }
            int idx=stack.peek();
            if(asteroids[idx]>=0)
            {
                int ab=Math.abs(as);
                if(asteroids[idx]>ab)
                {
                    break;
                }
                else if(asteroids[idx]==ab)
                {
                    stack.pop();
                    break;
                }
                else
                {
                    stack.pop();
                }
            }
            else
            {
                stack.push(i);
                break;
            }
        }
      } 
      int []res=new int[stack.size()];
      int i=res.length-1;
      while(!stack.isEmpty())
      {
        res[i]=asteroids[stack.pop()];
        i--;
      }
      return res;
    }
}