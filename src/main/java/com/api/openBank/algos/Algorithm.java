package com.api.openBank.algos;

public class
Algorithm {
    static int beautifulDays(int i, int j, int k) {
        int count=0;
        for (int a=i;a<=j;a++){
            int changed=reverseNumber(a);
            if ((a-changed)%k ==0){
                count++;
            }
        }

        return count;
    }

    static int reverseNumber(int value){
       int reversed=0;
       String strValue=String.valueOf(value);
       StringBuffer stringBuffer=new StringBuffer(strValue);
       StringBuffer changed=stringBuffer.reverse();
       reversed=Integer.parseInt(String.valueOf(changed));
       return reversed;
    }
    public static void main(String[] args){
        System.out.println( beautifulDays(20,23,6));
    }
}
