package com.advanced.filehandling;

import java.io.File;
import java.util.Arrays;

public class DirectoriesApp {
    public static void main(String[] args) {
        File businessFileDirectory = new File("Ebooks\\Business");

        if (businessFileDirectory.mkdirs()){
            System.out.println("The new directory is created");
        }else {
            System.out.println("cannot make new directory");
        }

        businessFileDirectory.deleteOnExit();

        File fileHandlingDirectory = new File("my-first-java-program\\src\\com\\advanced\\filehandling\\");
        System.out.println("Files in the filehandling directory: ");
        System.out.println(Arrays.toString(fileHandlingDirectory.list()));
        System.out.println(Arrays.toString(fileHandlingDirectory.listFiles()));
    }
}
