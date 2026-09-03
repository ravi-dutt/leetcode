class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=2)
        {
            return true;
        }
        int deltaY1=coordinates[1][1]-coordinates[0][1];
        int deltaX1=coordinates[1][0]-coordinates[0][0];
        for(int i=2;i<coordinates.length;i++)
        {
            int deltaY=coordinates[i][1]-coordinates[0][1];
            int deltaX=coordinates[i][0]-coordinates[0][0];
            if((deltaY1*deltaX)!=(deltaY*deltaX1))
            {
                return false;
            }
        }
     return true;
    }
}