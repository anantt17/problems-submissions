class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
        String prefix = strs[0];

        for(int i = 0 ; i < n ; i++){
        while(prefix.length() > 0){
            if(strs[i].startsWith(prefix)){
                break;
            }
            else{
                prefix = prefix.substring(0 , prefix.length()-1);
            }
        }
        }
        return prefix;
    }
}