class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0,count1=0;
        String str="";
        for(int i=0;i<words.length;i++){
            str=words[i];
            for(int j=0;j<allowed.length();j++){
                for(int k=0;k<str.length();k++){
                    if(allowed.charAt(j)==str.charAt(k)){
                        count++;
                    }
                }
            }
            if(count==str.length()){
                count1++;
            }
            count=0;
        }
        return count1;
    }
}