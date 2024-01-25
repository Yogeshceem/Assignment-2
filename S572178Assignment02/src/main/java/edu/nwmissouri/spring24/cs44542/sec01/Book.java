/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.nwmissouri.spring24.cs44542.sec01;

import java.text.DecimalFormat;

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
public class Book {


    private String title;
    private String author;
    private double price;
    private double taxPercentage;
    private static final double DISCOUNT = 10.0;
    private double totalPrice;
    private double finalPrice;

    // Parameterized constructor
    public Book(String title, String author, double price, double taxPercentage) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.taxPercentage = taxPercentage;
    }

    // No-argument constructor with default values
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 00.00;
        this.taxPercentage = 00.00;
    }

    // Getter and setter methods for each instance variable

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    // Method to calculate total price
    public double calcTotalPrice() {
        totalPrice = price + (price * taxPercentage / 100);
        return totalPrice;
    }

    // Method to calculate final price after applying discount
    public double calcFinalPrice() {
        finalPrice = totalPrice - (totalPrice * DISCOUNT / 100);
        return finalPrice;
    }

    // toString method to display values
   
   DecimalFormat df = new DecimalFormat("00.00");
    @Override
public String toString() {
    return "\n"+" Title of the Book: " + title + "\n" +
            "Author of the Book: " + author + "\n" +
            "Tax Percentage: " + df.format(taxPercentage) + "\n" +
            "Discount: " + String.format("%.2f", DISCOUNT) + "\n" +
            "Total Price of the Book including tax: $" + df.format(calcTotalPrice()) + "\n" +
            "Final Price of the Book after discount: $" + df.format(calcFinalPrice());

    }
}

