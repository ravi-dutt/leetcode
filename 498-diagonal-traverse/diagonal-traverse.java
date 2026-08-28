class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int res[]=new int[m*n];
        int k=0;
        for(int i=0;i<=m+n-2;i++)
        {
            int rowIdx=i<n?0:i-n+1;
            int colIdx=i<n?i:n-1;
            if(i%2==0)
            {
                List<Integer>al=new ArrayList<>();
                while(rowIdx<m&&colIdx>-1)
                {
                    al.add(mat[rowIdx][colIdx]);
                    rowIdx++;
                    colIdx--;
                }
                Collections.reverse(al);
                for(int idx=0;idx<al.size();idx++)
                {
                    res[k]=al.get(idx);
                    k++;
                }
            }
            else
            {
                while(rowIdx<m&&colIdx>-1)
                {
                    res[k]=mat[rowIdx][colIdx];
                    k++;
                    rowIdx++;
                    colIdx--;
                }
            }
        }
     return res;
    }
}