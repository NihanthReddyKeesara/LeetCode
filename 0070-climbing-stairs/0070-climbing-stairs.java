class Solution {
    public int climbStairs(int n) {
        int arr[]=new int[n+1];
        int firstTerm=1,secondTerm=1;
        for(int i=0;i<=n;i++){
            arr[i]=firstTerm;
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
        return arr[n];
    }
}