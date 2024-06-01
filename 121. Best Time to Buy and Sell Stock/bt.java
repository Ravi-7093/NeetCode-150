class Solution {
    public int maxProfit(int[] prices) {
        int left =0; // 2pointer approach
        int right=1; 
        int max_profit=0;


        while(right<prices.length){
           
            int curr_price = prices[right] - prices[left];

            if(prices[left]< prices[right]){
                max_profit = Math.max(max_profit,curr_price);
            }
            else{
                left=right; // move the left pointer only if the max_profit not updated ie buying price more than selling price of the stock
            }
            right+=1;

        }
        return max_profit;
}}
