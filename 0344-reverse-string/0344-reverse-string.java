class Solution {
    public void reverseString(char[] s) {
        int mid=s.length/2;
        char temp;
        int j=s.length-1;
        for(int i=0;i<mid;i++){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
    }
}