class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i ++){
            freq.put(nums[i] , freq.getOrDefault(nums[i] , 0) + 1);
        }

        if(freq.size() == nums.length){
            return false;
        }
        else{
            return true;
        }
    }
}