package QUESTIONs;

import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        int len = s.length()-1;
        // if(1>len || len>15){
        //     return "Please write within range 1-15";
        // }
        int num = 0;
        int intNum = 0;

        while(num<=len){
            if(s.charAt(num)=='I' && (num+1)<=len){
                if(s.charAt(num+1)=='V' && (num+1)<=len){
                    intNum+=4;
                    num+=2;
                }
                else if(s.charAt(num+1)=='X'  && (num+1)<=len){
                    intNum+=9;
                    num+=2;
                }
                else{
                    num+=1;
                    num+=1;
                }
            }
            else if(s.charAt(num)=='V'  && (num+1)<=len){
                intNum+=5;
                num+=1;
            }
            else if(s.charAt(num)=='X'){
                if(s.charAt(num+1)=='L' && (num+1)<=len){
                    intNum+=40;
                    num+=2;
                }
                else if(s.charAt(num+1)=='C' && (num+1)<=len){
                    intNum+=90;
                    num+=2;

                }
                else{
                    intNum+=10;
                    num+=1;
                }
            }
            else if(s.charAt(num)=='L'){
                intNum+=50;
                num+=1;
            }
            else if(s.charAt(num)=='C'){
                if(s.charAt(num+1)=='D' && (num+1)<=len){
                    intNum+=500;
                    num+=2;
                }
                else if(s.charAt(num+1)=='M' && (num+1)<=len){
                    intNum+=900;
                    num+=2;
                }
                else{
                    intNum+=100;
                    num+=1;
                }
            }
            else if(s.charAt(num)=='D'){
                intNum+=500;
                num+=1;
            }
            else if(s.charAt(num)=='M'){
                intNum+=1000;
                num+=1;
            }

        }
        return intNum;

}
}

public class ROMAN_TO_INT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();
        Solution s = new Solution();
        System.out.println(s.romanToInt(roman));
    
        
    }
}
