package com.api.openBank.algos;

import java.util.Scanner;

public class Circle {
    static double  getRadius(double radius){
        double rad=0;
        double value=Math.PI*( radius*radius);
        rad=Math.round(value*100.0)/100.0;
        return rad;
    }
    static double getCircumference(int radius){
        double circumference=0;
        double value=2*Math.PI*radius;
        circumference=Math.round(value*100.0)/100.0;
        return circumference;
    }
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius here: ");
        int radius=scanner.nextInt();
        System.out.println("Area of the circle is "+getRadius(radius));
        System.out.println("Circumference of the circle is "+getCircumference(radius));
    }
}
