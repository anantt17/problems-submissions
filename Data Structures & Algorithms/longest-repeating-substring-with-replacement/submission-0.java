class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int res = 0;
        int maxFreq = 0;

        Map<Character, Integer> freq = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, freq.get(c));
            while ((high - low + 1) - maxFreq > k) {
                char leftchar = s.charAt(low);
                freq.put(leftchar, freq.get(leftchar) - 1);

                if (freq.get(leftchar) == 0) {
                    freq.remove(leftchar);
                }

                low++;
            }

            int len = high - low + 1;
            res = Math.max(len, res);
        }

        return res;
    }
}
