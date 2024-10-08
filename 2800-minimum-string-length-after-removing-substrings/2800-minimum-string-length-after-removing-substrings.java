class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder(s);
        int index;
        while(true){
            if(!sb.toString().contains("AB") && !sb.toString().contains("CD")){
                break;
            }
             index=sb.toString().indexOf("AB");
            if(index!=-1){
                 sb.delete(index,index+2);     
            }
           
            index=sb.toString().indexOf("CD");
           if(index!=-1){
               sb.delete(index,index+2);     
           }
            
        }
        
        return sb.length();
    }
}