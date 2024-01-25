/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec01;

/**
* Class: 44542-01 Object-Oriented Programming
*
* @author Yogesh Ceemarla
* Description: Making sure everything works
* Due: 01/29/2024
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student, internet, or any other source.
* I will not share my source code with anyone under any circumstances.
*/


import java.text.DecimalFormat;
import java.util.Scanner;

public class BookDriver {
 
    public static void main(String[] args) {
        // Declare and initialize a Scanner object
        Scanner bookScanner = new Scanner(System.in);

        // Prompt values for title, author, price, and taxPercentage
     
        System.out.print("Enter the Title of the Book: ");
        String title1 = bookScanner.nextLine();
        System.out.print("Enter the Author of the Book: ");
        String author1 = bookScanner.nextLine();
        System.out.print("Enter the Price of the Book: ");
        double price1 = bookScanner.nextDouble();
        System.out.print("Enter the tax of the Book in Percentage:  ");
        double taxPercentage1 = bookScanner.nextDouble();

        // Create a new Book object named book1
        Book book1 = new Book(title1, author1, price1, taxPercentage1);

        // Print book1 using the toString() method
      System.out.println("****The details of book1 object are as follows:****" + book1);

        
    

        // Create another new Book object named book2 using the no-argument constructor
        Book book2 = new Book();

        // Print book2 using the toString() method
        System.out.println("\n****The details of book2 object are as follows:****\n" + book2);

       
        
        
        

        // Use setter methods to set values for book2
        book2.setTitle("Effective Java");
        book2.setAuthor("Joshua Bloch");
        book2.setPrice(250);
        book2.setTaxPercentage(8.11);

        // Print book2 using the toString() method after setting new values
        System.out.println("\n****The details of book2 object are as follows:***\n" + book2);

        // Print values returned by calcTotalPrice() and cahilcFinalPrice() methods
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("Total Price: $" + df.format( book2.calcTotalPrice()));
        System.out.println("Final Price: $" + df.format(book2.calcFinalPrice()));
         System.out.println("1:Class in Java:\n" +
"\n" +
"Role and Significance:\n" +
"In Java, a class is a blueprint or a template for creating objects. It serves as a way to define a data structure and behavior that objects of the class will exhibit. Objects are instances of classes, and they encapsulate data and behavior. The class defines the properties (attributes) and methods (functions) that characterize the objects."
                 + "Components of a Class Declaration in Java:\n" +
"\n" +
"A Java class declaration consists of several components:\n" +
"Access Modifiers: Determines the visibility of the class.\n" +
"class keyword: Declares the beginning of a class definition.\n" +
"Class Name: The identifier that names the class.\n" +
"Class Body: Contains fields, methods, and other members."
                 + "Constructor in a Java Class:\n" +
"\n" +
"Purpose:\n" +
"A constructor is a special method in a class that is used for initializing objects. It is called automatically when an object of the class is created. Constructors ensure that an object starts with a valid state.\n" +
"Difference from Other Methods:\n" +
"Constructors have the same name as the class and do not have a return type, distinguishing them from other methods."
                 + "Constructor Return Type:\n" +
"\n" +
"Constructors do not have a return type. The purpose of a constructor is to initialize an object, and it automatically returns an instance of the class. Explicitly specifying a return type for a constructor is not allowed."
                 + "Characteristics of Methods in Java Classes:\n" +
"\n" +
"Access Modifiers: Methods can have access modifiers like public, private, etc., determining their visibility.\n" +
"Return Type: Methods specify their return type, indicating the type of data they return (or void if they don't return any value).\n" +
"Method Name: The identifier that names the method.\n" +
"Parameters: Methods can take input parameters.\n" +
"Method Body: Contains the implementation of the method.");
        // Close the scanner
        bookScanner.close();
        
    }
    
}