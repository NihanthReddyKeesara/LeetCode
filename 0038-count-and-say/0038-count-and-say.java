class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String pre=countAndSay(n-1);
        StringBuilder res=new StringBuilder();

        int count=1;
        for(int i=1;i<pre.length();i++){
            if(pre.charAt(i)==pre.charAt(i-1)){
                count++;
            }else{
                res.append(count).append(pre.charAt(i-1));
                count=1;
            }
        }
        res.append(count).append(pre.charAt(pre.length()-1));
        return res.toString();
    }
}