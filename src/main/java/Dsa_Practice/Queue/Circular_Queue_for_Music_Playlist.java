package Dsa_Practice.Queue;

public class Circular_Queue_for_Music_Playlist {
    public static class Node{
        String Song;
        Node next;

        Node(String Song){
            this.Song = Song;
            this.next = null;
        }

    }
        public static class CircularQueue{
            Node front = null;
            Node rear = null;

            public boolean isEmpty(){
                return front ==  null;
            }

            public void AddSong(String Song){
                Node newNode = new Node(Song);
                if(isEmpty()){
                    front = rear = newNode;
                    rear.next = front;
                }else{
                    rear.next = newNode;
                    rear = newNode;
                    rear.next = front;
                }
                System.out.println(Song+ " Added to Queue");
            }

            Public void PlaySong(){
                if(isEmpty()){
                    System.out.println("Song Queue is Empty");
                    return;
                } else if () {
                    
                }
            }
        }
    public static void main(String[] args) {

    }
}
