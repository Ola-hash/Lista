package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileWriter {

    public static void write(String fileName, Lista liczby) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(liczby);
            objectOut.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

