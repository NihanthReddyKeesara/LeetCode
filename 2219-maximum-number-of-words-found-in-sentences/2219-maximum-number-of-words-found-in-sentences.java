class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=1;
        int max=0;
        
        for(int i=0;i<sentences.length;i++){
            String str=sentences[i];
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' '){
                    count++;
                }
            }
            if(max<count){
                max=count;
            }
            count=1;
        }
        return max;
    }
}