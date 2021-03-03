package by.alex.shop.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;


public class LogErrors {
     static File file = new File("Log.txt");
     static LocalDate date = LocalDate.now();

    public static void WriteLogErrors(String text) {


    try {
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(date+" - "+text);
        fileWriter.append("\n");
        fileWriter.flush();


    }catch (IOException e) {
        LogErrors.WriteLogErrors("IOException");
        e.printStackTrace();
    }
    }
}
