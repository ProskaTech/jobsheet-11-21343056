package latihan.latihan3;

// Created by 21343056_Muhammad Asyrof

public class Gajah extends Hewan {
    
    // meng-overwrite method pada Class Hewan
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan");
    }

    public void testInstanceMethod(){
        System.out.println("The Instance Method in Hewan");
    }

    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();

    }
    
}