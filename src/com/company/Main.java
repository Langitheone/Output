package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);

   String firstName;
   int age;
   String height;
   double gpa;

   Scanner keyboard = new Scanner(System.in);


   System.out.print( "What is your first name? " );
   firstName = keyboard.next();

   System.out.print( "How old are you? " );
   age = keyboard.nextInt();

   System.out.print( " How tall are you");
   height = keyboard.next();

   System.out.print( "What is your GPA " );
   gpa = keyboard.nextDouble();




    }
}
