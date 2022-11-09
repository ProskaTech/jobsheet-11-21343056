package latihan.latihan6;

// Created by 21343056_Muhammad Asyrof

public class UjiBus2{
    public static void main(String[] args) {
        Bus2 busBesar = new  Bus2(40);
        busBesar.cetak();

        busBesar.addPenumpang(15);
        busBesar.cetak();

        busBesar.addPenumpang(5);
        busBesar.cetak();

        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
    
}
