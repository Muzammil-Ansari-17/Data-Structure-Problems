package Dsa_Practice.Others;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Duet data.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
