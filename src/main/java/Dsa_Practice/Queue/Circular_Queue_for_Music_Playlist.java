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
                System.out.println(Song+ " Added to Playlist");
            }

            public void PlaySong(){
                if(isEmpty()){
                    System.out.println("Playlist is Empty");
                    return;
                } else {
                    System.out.println(front.Song+" is Playing");
                    try {
                        Thread.sleep(100000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    front = front.next;
                }
            }

            public void DisplayPlaylist(){
                if(isEmpty()){
                    System.out.println("PlayList is Empty");
                    return;
                }else{
                    System.out.println("Your Music Playlist is...");
                    Node current = front;
                    int i = 1;
                    while(current != null){
                        System.out.println("Song"+i+" :"+current.Song);
                        i++;
                        current = current.next;
                    }
                }
            }
        }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.AddSong("“Hall of Fame” – The Script ft. Will.i.am");
        queue.AddSong("“Believer” – Imagine Dragons");
        queue.AddSong("“The Nights” – Avicii");
        queue.AddSong("“On My Way” – Alan Walker");
        queue.AddSong("“Firework” – Katy Perry");

    }
}
