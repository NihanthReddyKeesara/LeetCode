class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        Map<Character,String> charToWord=new HashMap<>();
        Map<String,Character> wordToChar=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char schar=pattern.charAt(i);
            String tchar=words[i];
            if(charToWord.containsKey(schar)){
                if(!charToWord.get(schar).equals(tchar)){
                    return false;
                }
            }else{
                charToWord.put(schar,tchar);
            }

            if(wordToChar.containsKey(tchar)){
                if(!wordToChar.get(tchar).equals(schar)){
                    return false;
                }
            }else{
                wordToChar.put(tchar,schar);
            }
        }
        return true;
    }
}