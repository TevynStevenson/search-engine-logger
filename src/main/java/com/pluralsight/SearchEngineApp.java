package com.pluralsight;

import java.time.LocalDateTime;
import java.util.*;
import java.io.*;

//Add in date time formatter
import java.time.format.DateTimeFormatter;


public class SearchEngineApp {
    public static void main(String[] args) {
        //Main Class

        //Format dates/time
        DateTimeFormatter dashedDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        //Add searchEngineLogger method to be called
        searchEngineLogger(dashedDate.format(LocalDateTime.now()) + " " + "launch");


        //Prompt user for a search term that they wish to search
        Scanner input = new Scanner(System.in);

        //Add while loop

        while (true) {
            System.out.print("Enter search term: (X or x to exit): ");

        String searchTerm = input.nextLine();

        //Add method for exiting the application
        if (searchTerm.equalsIgnoreCase("X")) {
            System.out.println("\nExiting...");
            searchEngineLogger(dashedDate.format(LocalDateTime.now()) + " " + "exit");
            break;
        } else
            searchEngineLogger(dashedDate.format(LocalDateTime.now()) + " " + "search" + ":" + " " + searchTerm);

        }



    }

    //Other Methods

//Create a method that logs the actions of the user.
//Write each user action to a file named logs.txt

    public static void searchEngineLogger(String action) {
        //Initialize the scanner
        //Initialize FileWriter
        //Initialize the BufferedWriter

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
