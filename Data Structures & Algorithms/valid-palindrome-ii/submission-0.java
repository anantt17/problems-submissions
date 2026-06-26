class Solution {

    // helper function OUTSIDE main function but INSIDE class
    public boolean isPal(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low) == s.charAt(high)) {
                // match → move both
                low++;
                high--;
            } else {
                // mismatch → try skipping left OR right
                return isPal(s, low + 1, high) || isPal(s, low, high - 1);
            }
        }
        return true;
    }
}