class Solution {
    public String intToRoman(int num) {
        String res="";
        while(num!=0){
            if(num>=1000){
                res=res+"M";
                num=num-1000;
            }else if(num>=900){
                res=res+"CM";
                num=num-900;
            }else if(num>=500){
                res=res+"D";
                num=num-500;
            }else if(num>=400){
                res=res+"CD";
                num=num-400;
            }else if(num>=100){
                res=res+"C";
                num=num-100;
            }else if(num>=90){
                res=res+"XC";
                num=num-90;
            }else if(num>=50){
                res=res+"L";
                num=num-50;
            }else if(num>=40){
                res=res+"XL";
                num=num-40;
            }else if(num>=10){
                res=res+"X";
                num=num-10;
            }else if(num==9){
                res=res+"IX";
                num=num-9;
            }else if(num>=5){
                res=res+"V";
                num=num-5;
            }else if(num==4){
                res=res+"IV";
                num=num-4;
            }else{
                res=res+"I";
                num=num-1;
            }
            
        }
        return res;
    }
}