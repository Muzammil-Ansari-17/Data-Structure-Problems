package Dsa_Practice.Others;

import java.awt.image.BufferStrategy;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class File_Input_Output {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Test.txt"));
            writer.write("My name is Muzammil");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
