class Solution {
    public int removeDuplicates(int[] nums) {
        int o = 0;
        int k =1;
        int cm = 1;

        while(cm < nums.length){
            if(nums[cm] == nums[cm -1]){
                cm++;
                continue;
            }
            else{
                nums[o+1] = nums[cm];
                o++;
                k++;
                cm++;
            }
        }
        return k;
    }
}