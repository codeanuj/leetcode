class Solution {
    public int maxProfit(int[] prices) {
       
        // First approach
        
        
        //create auxillary array with maxLeft and minRight
        int maxLeft[]=new int[prices.length];
        int minRight[]= new int[prices.length];
        
        maxLeft[prices.length-1]=prices[prices.length-1];
        minRight[0]=prices[0];
        
        for(int i=prices.length-2; i>=0; i--){
            maxLeft[i]=Math.max(prices[i],maxLeft[i+1] );
        }
        
         for(int i=1; i<prices.length; i++){
            minRight[i]=Math.min(prices[i],minRight[i-1] );
        }
        
        int profit=Integer.MIN_VALUE;;
        
        for(int i=0; i<prices.length; i++){
            profit = Math.max(profit, maxLeft[i]-minRight[i]);
        }
        
        return profit;
        
        //second approach
        
         int min=Integer.MAX_VALUE;
         int profit=0;
  
    //you will just assume that you sell the stock everyday and find the difference between current day price
    //and the minimum price you have seen so far
    
       for(int i=0; i<prices.length; i++){
        
        min =Math.min(min, prices[i]);
        profit= Math.max(profit, prices[i]-min);
    }
    
    return profit;
        
    }
}
