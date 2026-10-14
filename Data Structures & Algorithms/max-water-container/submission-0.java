class Solution {
    public int maxArea(int[] heights) {
        int res = 0;

        int li = 0;
        int ri = heights.length-1;

        while(li < ri){
            int height1 = heights[li];
            int height2 = heights[ri];

            int area = Math.min(height1,height2) * (ri-li); //height*width

            if(height1 < height2){
                li++;
            }else{
                ri--;
            }

            res = Math.max(area,res);


        }
        return res;
    }
}
