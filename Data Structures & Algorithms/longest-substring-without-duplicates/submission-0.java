class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int res = 0;

        Map<Character , Integer> freq  = new HashMap<>();

        for(int high = 0 ; high < s.length() ; high++){
            char ch = s.charAt(high);
            freq.put(ch , freq.getOrDefault(ch , 0) + 1);

            while(freq.get(s.charAt(high)) > 1){
                char leftch =  s.charAt(low);
                freq.put(leftch , freq.get(leftch) - 1);

                    if(freq.get(leftch) == 0){
                        freq.remove(leftch);
                    }
                    low++;
            }

            int len = high - low + 1;
             res = Math.max(len , res);
        }

        return res;
    }
}
