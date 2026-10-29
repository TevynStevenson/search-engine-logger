package com.pluralsight;

import java.util.*;
import java.io.*;


public class SearchEngineApp {
    public static void main(String[] args) {
                                //Main Class

        //Add searchEngineLogger method to be called
        searchEngineLogger("launch");


        //Prompt user for a search term that they wish to search
        Scanner input = new Scanner(System.in);
        System.out.print("Enter search term: (X or x to exit): ");
        String searchTerm = input.nextLine();

        //Add method for searchTerm
        searchEngineLogger(searchTerm);

        //Add method for exiting the application
        if (searchTerm.equalsIgnoreCase("X")){
            searchEngineLogger("exit");
        } else {
            searchEngineLogger("search");
        }



    }

                                //Other Methods

//Create a method that logs the actions of the user.
//Write each user action to a file named logs.txt

public static void searchEngineLogger(String action ){
        //Initialize the scanner
        //Initialize the BufferedWriter
        //Initialize FileWriter
    FileWriter fileWriter = null;
    try {
        fileWriter = new FileWriter("logs.txt", true);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    Scanner input = new Scanner(System.in);


    //write to the file
    String text = action;
    try {
        bufferedWriter.write(text);
        bufferedWriter.newLine();

        // Close the bufferedwriter
        bufferedWriter.close();


    } catch (Exception e) {
        System.out.println("Error while writing to file");
        throw new RuntimeException(e);
    }

}


   //Start with fileWriter
   // Then go to bufferedwriter



}
