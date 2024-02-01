package com.advanced.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingApp {

    public static void main(String[] args) {
        String FILE_DIR = "my-first-java-program\\src\\com\\advanced\\filehandling\\";
        File famousQuotesFile = new File(FILE_DIR+"famousQuotes.txt");

        try {
            if (famousQuotesFile.createNewFile()){
                System.out.println("The file is created");
            }
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        File famousPersonQuotes = new File(FILE_DIR+"famousPersonQuotes.txt");
        if (famousQuotesFile.renameTo(famousPersonQuotes)){
            System.out.println("The File is renamed");
        }
        if (famousPersonQuotes.delete()){
            System.out.println("The File is deleted");
        }

    }
}
