class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();

        while(right < s.length()){

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;

                maxlen = Math.max(right-left, maxlen);
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }

        }
        return maxlen;
    }
}