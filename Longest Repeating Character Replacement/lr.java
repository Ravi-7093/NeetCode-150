class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> hmap = new HashMap<>(); // 
        int left=0,right =0;
        int max=0;
        int n = s.length();
        int max_count=0;
        while(right<n){ // utilizing left and right pointer
            char r = s.charAt(right);
            hmap.put(r,hmap.getOrDefault(r,0)+1); //iterate over the string and place character and character count in the hashmap
             max_count= Math.max(max_count,hmap.get(r));// get max count of the character so that we decide which character to replace

            if(right - left +1 - max_count>k){ // we update the window size when we know that the given window has character which is more than k
                char l = s.charAt(left);// decement the character count present in left most position and move ahaead
                hmap.put(l,hmap.get(l)-1);
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
