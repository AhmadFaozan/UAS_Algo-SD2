
package QueueUas;

public class AntrianUas {
    public static void main(String[] args){
        Antrian antrian = new Antrian(5);
        antrian.enqueue(9);
        antrian.display();
        antrian.enqueue(8);
        antrian.display();
        System.out.println("Yang diambil dari antrian = " + antrian.dequeue());
        System.out.println("Nama saya adalah Ahmad Faozan");
        antrian.display();
        System.out.println();
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("Nilai yang paling depan = " + antrian.peek());
        
        
    }
    
}
