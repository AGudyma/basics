package com.brainacad.agudyma.lesson4;
import java.util.Scanner;
/**
 * Created by User on 25.04.2016.
 */
public class cycles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 3){
            System.out.println("<3");}
        if (number > 3) System.out.println(">3");
        else if (number >10) {System.out.println(">10");}
    }
}