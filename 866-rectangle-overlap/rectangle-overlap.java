class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int rec1L1=rec1[0],
        rec1B1=rec1[1],
        rec1L2=rec1[2],
        rec1B2=rec1[3];
        int rec2L1=rec2[0],
        rec2B1=rec2[1],
        rec2L2=rec2[2],
        rec2B2=rec2[3];
        if(rec2L1>=rec1L2)
        {
            return false;
        }
         if(rec2B1>=rec1B2)
        {
            return false;
        }
         if(rec1L1>=rec2L2)
        {
            return false;
        }
         if(rec1B1>=rec2B2)
        {
            return false;
        }
        return true;
    }
}