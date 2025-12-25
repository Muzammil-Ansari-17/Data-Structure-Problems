package Dsa_Practice.Others;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class File_Writer {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Test.txt"));
            writer.write("My name is Muzammil");
            writer.newLine();
            writer.write("I am student of Computer Science");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
