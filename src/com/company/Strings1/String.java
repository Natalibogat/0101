package com.company.Strings1;

public class String {
    public static void main(string[] args){
        //Получить символ по его номеруб а также номер символа в кодовой таблице Utf-8
        String s="Hello, world";
        int n = 4;
        char c = s.charAt(n);
        int numUTF = c;
        System.out.println(c);
        System.out.println(numUTF);


        String s1 = "first", s2 = "second";
        System.out.println(s1.compareTo(s2));
    }
}
