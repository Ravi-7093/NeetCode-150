class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> st = new HashSet<>();
       int left=0;
       int max_len=0;
       for(int right =0; right<s.length();right++){ //  check for  the right index character in the set 
            char c = s.charAt(right);
            while(st.contains(c)){
                st.remove(s.charAt(left));// if present remove it from the left of the window
                left+=1;// move window forward

            }
            st.add(c);// add character at the right index back to set
            max_len=Math.max(max_len,right-left+1);

       }
       return max_len;
    }
}
