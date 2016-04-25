package com.brainacad.agudyma.primitives;

/**
 * Created by User on 25.04.2016.
 */
public class lesson3 {
    public static void main(String[] args) {
            byte b1 = (byte) 28, b2 = 3;
            short s = 1337;
            int i = 1488;
            long l = 1L;
            float f = 111;
            double d = 42;
            char ch = '\u0101';
            boolean boo = false;
            boolean boo2 = true;
            boolean res = b1 < b2;
            System.out.println(b1 / b2);
            System.out.println(b1 % b2);
            System.out.println(ch);
            System.out.println(!boo);
            System.out.println(boo && boo2);
            System.out.println(++b2 + ++b2);
            System.out.println(Integer.toBinaryString(i));
            System.out.println(Integer.toBinaryString( i >>4 ));
            System.out.println(Integer.toBinaryString( i <<3 ));
            System.out.println(!res );
            System.out.println(!res ? boo : boo2);
           }
    }





