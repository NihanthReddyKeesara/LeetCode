class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence=sentence.toLowerCase();
        Set<Character>al=new HashSet<>();
        for(char c:sentence.toCharArray()){
            if(Character.isLetter(c)){
                al.add(c);
            }
        }
        return al.size()==26;
    }
}