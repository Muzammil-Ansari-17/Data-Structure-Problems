package Dsa_Practice.Others.Assignment_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NextWordPrediction {

    Node head;
    public class Node{
        String word;
        Node next;

        Node(String word){
            this.word = word;
            this.next = null;
        }
    }

    public Node createLLFromData(String data) {
        String[] word = data.split("\\s+");
        Node head = null;

        for (String w : word) {
            Node newNode = new Node(w);
            if (head == null) {
                head = newNode;
            } else {

                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        return head;
    }

    public String[] predictNextWord(String word, Node head) {
        ArrayList<String> nextWords = new ArrayList<>();
        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.word.equalsIgnoreCase(word)) {
                nextWords.add(temp.next.word);
            }
            temp = temp.next;
        }

        return nextWords.toArray(new String[0]);
    }


    public static void main(String[] args) {

        StringBuilder data = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Duet data.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                data.append(line).append(" ");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String fulldata = data.toString();
        String Symbol = ",.:!@#$%^&*()_+-=<>/?;\"'{}[]\\|`~";

        for (int i = 0; i < Symbol.length(); i++) {
            fulldata = fulldata.replace(Symbol.charAt(i),' ');
        }
        fulldata = fulldata.toLowerCase();

        NextWordPrediction obj = new NextWordPrediction();
        obj.head = obj.createLLFromData(fulldata);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to predict next words: ");
        String inputWord = sc.nextLine().trim();

        String[] nextWords = obj.predictNextWord(inputWord, obj.head);



        System.out.println("Possible next words:");
        for (String w : nextWords) {
            System.out.println(w);
        }
        sc.close();
    }

}
