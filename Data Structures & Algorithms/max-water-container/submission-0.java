class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int li = 0;
        int ri = heights.length - 1;

        while(li<ri){
            int left = heights[li];
            int right = heights[ri];

            int area = Math.min(left , right) * (ri-li);
            res = Math.max(res,area);

            if(left<right){
                li++;
            }
            else{
                ri--;
            }
        }

        return res;
    }
}
