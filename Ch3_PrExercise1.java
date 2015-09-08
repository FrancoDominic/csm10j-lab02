/*
Programmer: Franco Lavares
Title:      Chapter 3 Practice Exercise 1
Date:       September 8 2015
Filename:   Ch3_PrExercise1.java
 */



//package Ch3_PrExercise1; (this was commented out so this code may be compiled using terminal)

//this imports all the necessary packages and classes
import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.text.DecimalFormat;
   

public class Ch3_PrExercise1 
{
   
    public static void main(String[] args) throws FileNotFoundException
    {
        //declaration of variables
        double length, width, areaRectangle, perimeter, radius, areaCircle,
                circumference, beginningBalance, interestRate, finalBalance,
                pi, interestPercent;
        
        int age, nextLetter;
        
        char letter;
        
        String firstName;
        String lastName;
      
        //this is where the program gets the data and associates inFile as a Scanner type variable
        Scanner inFile = new Scanner(new File("inData.txt"));
        
        //this is how the program outputs the data as a .txt and associates outFile as a PrintWriter type variable
        PrintWriter outFile = new PrintWriter(new File("outData.txt"));
        
        //this is how the program assigns values to the variables from the data
        //gathered from the input file
        length = inFile.nextDouble();
        width = inFile.nextDouble();
        radius = inFile.nextDouble();
        firstName = inFile.next();
        lastName = inFile.next();
        age = inFile.nextInt();
        beginningBalance = inFile.nextDouble();
        interestRate = inFile.nextDouble();
        letter = inFile.next().charAt(0);
        
        //these formulas are used to calculate variables using gathered data
        //from the input file
        areaRectangle = length*width;
        perimeter = (length*2)+(width*2);
        pi = 3.1416;
        areaCircle = (pi*(radius*radius));
        circumference = 2*pi*radius;
        interestPercent = interestRate*0.010;//this converts interest rate from percentage to decimal
        finalBalance = (beginningBalance*interestPercent) + beginningBalance;
        nextLetter = (int)letter+1;//the ascii value must be an int so that it may be incremented
        
        //this forces the doubles to round to two decimal places
        DecimalFormat decim = new DecimalFormat("#.00");
        
        //Rectangle
        outFile.println("Rectangle:");
        outFile.print("Length = "+ decim.format(length) + ", width = "
                + decim.format(width) + ", area = " + decim.format(areaRectangle)
                + ", perimeter = " + decim.format(perimeter));
        outFile.println('\n');
        
        
        //Circle
        outFile.println("Circle:");
        outFile.print("Radius = " + decim.format(radius) + ", area = "
                + decim.format(areaCircle) + 
                ", circumference = " + decim.format(circumference));
        outFile.println('\n');
        
        //Interest Rate
        outFile.print("Name: " + firstName + " " + lastName + ','
                + " age: " + age);
        outFile.print("\nBeginning balance = $" + decim.format(beginningBalance) + ',' + 
               " interest rate = " + decim.format(interestRate) + "\n");
        outFile.print("Balance at the end of the month = $" + decim.format(finalBalance));
        outFile.println('\n');
        
        //"The character that comes after A..."
        outFile.print("The character that comes after " + letter + 
                " in the ASCII set is " + (char)nextLetter);      //this converts the int ASCII value back to a char
        outFile.println('\n');
        
      
        /*
        this was used for testing
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(beginningBalance);
        System.out.println(interestRate);
        */
        
       
        
        outFile.close();
   
    }
    
}

