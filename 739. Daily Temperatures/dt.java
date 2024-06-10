class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] res = new int[temperatures.length];
        Stack<Integer> sq = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while((sq.size()!=0) && temperatures[sq.peek()]<temperatures[i]){ // check if the upcoming temperature is greater than the present temerature on stack 
                int top_idx= sq.peek(); // if yes remove the index and update the res for that particular index ie that particular day 
                res[top_idx]= i-top_idx;
                sq.pop();// pop index


            }
            sq.push(i);
        }
        return res;
    }
}
