class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int i=mat.length;
        int j=mat[0].length;
        int ans[][]=new int[r][c];
        int x=0;
        int y=0;
        if(i*j!=r*c)
        {
            return mat;
        }
        for(int a=0;a<i;a++)
        {
            for(int b=0;b<j;b++)
            {
                ans[x][y]=mat[a][b];
                y++;
                if(y==c)
                {
                    y=0;
                    x++;
                }
            }
        }
        return ans;
    }
}