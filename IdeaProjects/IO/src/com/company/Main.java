package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String fileName = "file.txt";
        File file = new File("hell");
        file.getPath();
        System.out.println(file.getPath());
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            printWriter.print("Hello IO ");
            printWriter.flush();

            FileReader fileReader = new FileReader(fileName);
            int c = 0;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException fileNotFoundException) {

        } catch (IOException ioException) {

        }

    }
}
