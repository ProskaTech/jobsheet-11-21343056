package latihan.latihan4;

// Created by 21343056_Muhammad Asyrof

public class B extends A {
    private int b; 

    public void setB (int nilai){
        b = nilai;
    }

    public int getB (){
        return b;
    }

    // melakukan override terhadap method tampilkanNilai()
    // yang terhadap pada kelas A 
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b = "+ getB());
    }

}

