package main.artfix;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIng {

    public static String ReadData = null;

    public static void read(String FileName) {
        try {
            File readwrite = new File("app_files/" + FileName + ".txt");
            Scanner scan = new Scanner(readwrite);
            ReadData = scan.nextLine();
        } catch (Exception e) {
            System.out.println("File System: ERR -> Read");

        }

    }

    public static void write(String FileName, String WhatToWrite) {
        try {
            FileWriter readTxt = new FileWriter("app_files/" + FileName + ".txt");
            readTxt.write(WhatToWrite);
            readTxt.close();
        } catch (Exception e) {
            System.out.println("File System: ERR -> Write");

        }
    }
}
