class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        int count=0;
        HashSet<String> al=new HashSet<>();
        for(String word:arr1){
            count=0;
            for(int i=0;i<arr1.length;i++){
                if(word.equals(arr1[i])){
                    count++;
                }
            }
            for(int j=0;j<arr2.length;j++){
                if(word.equals(arr2[j])){
                    count++;
                }
            }

            if(count==1){
                al.add(word);
            }
        }

        for(String word:arr2){
            count=0;
            for(int i=0;i<arr1.length;i++){
                if(word.equals(arr1[i])){
                    count++;
                }
            }

            for(int j=0;j<arr2.length;j++){
                if(word.equals(arr2[j])){
                    count++;
                }
            }

            if(count==1){
                al.add(word);
            }
        }

    String[] str=al.toArray(new String[0]);

    return str;

    }
}