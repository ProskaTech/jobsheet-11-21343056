package latihan.latihan6 ;

// Created by 21343056_Muhammad Asyrof

public class Bus2{
    public int penumpang;
    public int maxPenumpang;

    // konstruktor
    public Bus2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp>maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        } 
        else {
            this.penumpang = temp;
        }
    }

    public void cetak(){
        System.out.println("Penumpang bus sekarang : "+ penumpang);
        System.out.println("Penumpang bus sekarang : "+ maxPenumpang);
    }
}