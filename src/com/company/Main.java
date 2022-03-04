package com.company;

import javax.xml.transform.Result;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(3));
        System.out.println(isEven(3));
        int a=1, b=2;
        int temp;
        temp = a; a=b; b=temp;
        System.out.printf("a=%d, b=%d5n",a,b);
        System.out.println("a="+a+", b="+b);
        int a=1, b=2;
        swap(a,b);
        System.out.println("a");
        int a=1, b=2;
        System.out.println(Arrays.toString(Result));


    }
    /*
    1!=1; 2!=1;3!=6; 4!=1*2*3*4=24;
    */
    static int factorial(int n){
        int result = 1;
        for (int i=1;i<=n; i++)
            result*=i;
        return result;
    }
    static  boolean isEven(int n){
        if(n%2==0) return true;
        else return false;
    }
    static int max(int a,int b){
        if(b>a) return b;
        else return a;
    }
    static int[] swap(int a,int b){
        int temp;
        temp = a; a=b; b=temp;
        int[] result = new int [2];
        result [0] = a;
        result [1] = b;
        return result;
        String s="Hello, world";
        int n = 4;
        System.out.println(s.charAt(n));
    }

}
