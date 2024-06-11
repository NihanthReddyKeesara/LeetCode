class Solution {
    public String reverseWords(String s) {
        String strArr[]=s.split(" ");
        String[] arr=new String[strArr.length];
        int i=0;
        for(String str: strArr){
            arr[i]=new StringBuilder(str).reverse().toString();
            i++;
        }
        
        String res=String.join(" ",arr);
        return res;  
    }
}