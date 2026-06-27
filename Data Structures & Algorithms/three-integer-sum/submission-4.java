class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
           Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
     
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int h = n - 1;
            int target = -nums[i];

            while (l < h) {
                int sum = nums[l] + nums[h];

                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    l++;
                    h--;

                    while (l < h && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    while (l < h && nums[h] == nums[h + 1]) {
                        h--;
                    }
                }

                else if (sum < target) {
                    l++;
                } else {
                    h--;
                }
            }
        }

        return res;
    }
}
