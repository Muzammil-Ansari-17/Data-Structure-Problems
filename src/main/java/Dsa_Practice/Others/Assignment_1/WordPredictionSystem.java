package Dsa_Practice.Others.Assignment_1;

import java.util.Scanner;
class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class WordPredictionSystem {

    // Remove special characters (simple logic)
    public static String preprocess(String data) {
        String symbols = ",.:!@#$%^&*()_+-=<>/?;\"'{}[]\\|`~";
        String result = "";

        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            boolean isSymbol = false;

            for (int j = 0; j < symbols.length(); j++) {
                if (ch == symbols.charAt(j)) {
                    isSymbol = true;
                    break;
                }
            }

            if (!isSymbol) {
                result += ch;
            }
        }
        return result.toLowerCase();
    }

    // Create Linked List from data
    public static Node createLLFromData(String data) {

        data = preprocess(data);
        String[] words = data.split(" ");

        Node head = null, tail = null;

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                Node newNode = new Node(words[i]);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
        }
        return head;
    }

    // Predict next word(s)
    public static String[] predictNextWord(String input, Node head) {

        input = preprocess(input);
        String[] inWords = input.split(" ");

        String result = "";
        Node temp = head;

        while (temp != null && temp.next != null && temp.next.next != null) {
            if (temp.data.equals(inWords[0]) &&
                    temp.next.data.equals(inWords[1])) {

                result += temp.next.next.data + " ";
            }
            temp = temp.next;
        }

        return result.split(" ");
    }

    // Main Method
    public static void main(String[] args) {

        // Sample data (normally read from duet data.txt)
        String data =
                "Faculty of Computer Science Software Engineering Electrical Engineering";

        Node head = createLLFromData(data);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two words: ");
        String input = sc.nextLine();

        String[] output = predictNextWord(input, head);

        System.out.println("Predicted Next Words:");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
