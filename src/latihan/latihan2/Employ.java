package latihan.latihan2;

    public class Employ extends Person{
        private String noKaryawan;

        // Konstruktor
        public Employ (String noKaryawan, String name, int age){
            super(name, age);
            this.noKaryawan = noKaryawan;
        }

        // metode
        public void info() {
            System.out.println("No.Karyawan : "+this.noKaryawan);
            super.info();
        }

    }
