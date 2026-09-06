class Solution {
    public void bfs(char[][]grid,int r,int c,int[][]dir)
    {
        Queue<int[]>queue=new LinkedList<>();
        queue.add(new int[]{r,c});
        grid[r][c]='0';
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                int []cur=queue.remove();
                int cR=cur[0];
                int cC=cur[1];
                for(int []dirs:dir)
                {
                    int nR=cR+dirs[0];
                    int nC=cC+dirs[1];
                    if(nR>=grid.length)
                    {
                        continue;
                    }
                    if(nC>=grid[0].length)
                    {
                        continue;
                    }
                    if(nR<0)
                    {
                        continue;
                    }
                    if(nC<0)
                    {
                        continue;
                    }
                    if(grid[nR][nC]=='0')
                    {
                        continue;
                    }
                    grid[nR][nC]='0';
                    queue.add(new int[]{nR,nC});
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int c=0;
        int [][]dir={
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    c++;
                    bfs(grid,i,j,dir);
                }
            }
        }
        return c;
    }
}