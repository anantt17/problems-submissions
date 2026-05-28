class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[n+m];
        int i = 0;
        int j = 0;
       int index = 0;

        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                res[index] = nums1[i];
                index++;
                i++;
            }
            else{
                res[index] = nums2[j];
                index++;
                j++;
            }
        }

            while(j<n){
                res[index] = nums2[j];
                index++;
                j++;
            }


            while(i<m){
                res[index] = nums1[i];
                index++;
                i++;
            }

            for(int x = 0 ; x < res.length ; x++){
                nums1[x] = res[x];
            }
    }
}