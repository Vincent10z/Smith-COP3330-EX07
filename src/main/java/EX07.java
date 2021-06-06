/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {

        double conv = 0.09290304;

        Scanner enter = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        String length = enter.nextLine();
        int a = Integer.parseInt(length);

        System.out.println("What is the width of the room in feet?");
        String width = enter.nextLine();
        int b = Integer.parseInt(width);

        int totalf = a*b;


        System.out.println("The area is");
        System.out.print(a*b);
        System.out.print(" square feet");
        System.out.print("\n" + (totalf*conv));
        System.out.print(" square meters");


    }
}