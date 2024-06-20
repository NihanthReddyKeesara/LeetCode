class Solution {
    public int longestPalindrome(String s) {

        Map<Character,Integer> charCountMap=new HashMap<>();

        for(char c:s.toCharArray()){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }
        int length=0;
        boolean hasOddFrequency=false;
        for(int count:charCountMap.values()){
            if(count%2==0){
                length+=count;
            }else{
                length+=count-1;
                hasOddFrequency=true;
            }

        }

        if(hasOddFrequency){
            length++;
        }
        return length;
    }
}