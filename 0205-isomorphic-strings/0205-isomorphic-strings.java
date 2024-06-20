class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> stoT=new HashMap<>();
        Map<Character,Character> ttoS=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);

            if(stoT.containsKey(schar)){
                if(stoT.get(schar)!=tchar){
                    return false;
                }
            }else{
                stoT.put(schar,tchar);
            }

            if(ttoS.containsKey(tchar)){
                if(ttoS.get(tchar)!=schar){
                    return false;
                }
            }else{
                ttoS.put(tchar,schar);
            }
        }
        return true;
    }
}