
package StackUas;

public class TumpukanApp {
    public static void main(String [] args){
        Tumpukan tumpukan=new Tumpukan(5);
        tumpukan.push(9);
        tumpukan.baca();                
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        long nilaitop = tumpukan.pop();
        System.out.println("nilai teratas = "+nilaitop);
        System.out.println("Nama saya adalah Ahmad Faozan");
        long nilai=tumpukan.pop();
        System.out.println("nilai yang dihapus = "+nilaitop);
        System.out.println("\n");
        tumpukan.push(4);
        tumpukan.baca();
        
        
    }
    
}
