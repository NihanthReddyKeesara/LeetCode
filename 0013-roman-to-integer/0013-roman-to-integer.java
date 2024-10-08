class Solution {
    public int romanToInt(String s) {
        int count=0,sum=0,i=0;
        while(count!=s.length()){
            char ch=s.charAt(i);
            if(ch=='M'){
                sum=sum+1000;
                i++;
                count++;
            }else if(ch=='D'){
                sum=sum+500;
                i++;
                count++;
            }else if(ch=='C'){
                if(i + 1 < s.length() && s.charAt(i+1)=='D'){
                    sum=sum+400;
                    i=i+2;
                    count=count+2;
                }else if(i + 1 < s.length() && s.charAt(i+1)=='M'){
                    sum=sum+900;
                    i=i+2;
                    count=count+2;
                }else{
                    sum=sum+100;
                    i++;
                    count++;
                }
                
            }else if(ch=='L'){
                sum=sum+50;
                i++;
                count++;
            }else if(ch=='X'){
                if(i + 1 < s.length() && s.charAt(i+1)=='L'){
                    sum=sum+40;
                    i=i+2;
                    count=count+2;
                }else if(i + 1 < s.length() && s.charAt(i+1)=='C'){
                    sum=sum+90;
                    i=i+2;
                    count=count+2;
                }else{
                    sum=sum+10;
                    i++;
                    count++;
                }
            }else if(ch=='V'){
                sum=sum+5;
                i++;
                count++;
            }else if(ch=='I'){
                if(i + 1 < s.length() && s.charAt(i+1)=='V'){
                    sum=sum+4;
                    i=i+2;
                    count=count+2;
                }else if(i + 1 < s.length() && s.charAt(i+1)=='X'){
                    sum=sum+9;
                    i=i+2;
                    count=count+2;
                }
                else{
                    sum=sum+1;
                    i++;
                    count++;
                }
            }
        }
        return sum;
    }
}