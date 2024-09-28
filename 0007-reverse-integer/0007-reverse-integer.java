class Solution {
    public int reverse(int num) {
        int rem=0,rev=0;
        int x=Math.abs(num);
        while(x!=0){
            rem=x%10;
          
            if(rev>(Integer.MAX_VALUE-rem)/10){
                return 0;
            }  
            rev=rev*10+rem;          
            x=x/10;
        }

        
        return (num<0) ? (-rev):rev;
    }
}