package com.api.openBank.algos;

public class DigitalCalculator {
    static String decimalToBinary(int decimal){
        String converted= " ";
        int temp;
        while (decimal>0){
            temp=decimal%2;
            converted = converted+" "+temp;
            decimal /=2;
        }
        return converted;
    }

    static int decimalToOctal(int decimal){
        int converted = 0, remainder = 0, multiplier = 0, i = 0;

        while (decimal!=0) {
            remainder = decimal % 8;
            multiplier = (int) Math.pow(10, i);
            converted += (remainder * multiplier);
            decimal /= 8;
            i++;
        }
        return converted;
    }
    static String decimalToHexadecimal(int decimal){
        String converted=" ";
        int remainder;
        char hexCharacter[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0)
        {
            remainder=decimal%16;
            converted=hexCharacter[remainder]+converted;
            decimal=decimal/16;
        }

        return converted;
    }

    public static void main(String[] args){

        System.out.println("Decimal to binary "+decimalToBinary(10));
        System.out.println("Decimal to Octal "+decimalToOctal(123));
        System.out.println("Decimal to Hexadecimal "+decimalToHexadecimal(123));
    }
}
