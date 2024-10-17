class Solution {
    public int maxProfit(int[] arr) {
       int buyPrice=arr[0];
       int profit=0;
       for(int i=1;i<arr.length;i++){
        if(arr[i]<buyPrice){
            buyPrice=arr[i];
        }else{
            int currProfit=arr[i]-buyPrice;
            profit=Math.max(currProfit,profit);
        }
       }
    return profit;
    }
}