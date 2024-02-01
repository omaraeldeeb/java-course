package com.advanced.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {
    public static void main(String[] args) {
        String JULIUS_CESAR_FILE_PATH = "my-first-java-program/src/com/advanced/filehandling/JuliusCesar.txt";

        try (FileWriter bookWriter = new FileWriter(JULIUS_CESAR_FILE_PATH, true) ){
            bookWriter.write("Even you, Brutus?\n");
            bookWriter.append("Yes 🤣.\n");
        } catch (IOException exception) {               
            exception.printStackTrace();
        }

    }
}
