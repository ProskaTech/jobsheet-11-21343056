package latihan.latihan4;

// Created by 21343056_Muhammad Asyrof

public class DemoOverride2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.setA(50);
        obj.setB(150);
        // akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}

