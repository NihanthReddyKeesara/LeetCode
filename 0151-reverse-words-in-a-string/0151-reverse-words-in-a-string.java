class Solution {
    public String reverseWords(String s) {
        String[] parts=s.trim().split("\\s+");
        String[] reversedString=new String[parts.length];
        int j=parts.length-1;
        for(int i=0;i<reversedString.length;i++){
            reversedString[i]=parts[j];
            j--;
        }

        
        String result=String.join(" ",reversedString);

        return result;
    }
}