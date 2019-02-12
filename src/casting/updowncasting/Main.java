package casting.updowncasting;

public class Main {
    /*
    Upcasting dan downcasting terkait erat dengan konsep pewarisan.
    Sangat umum untuk menggunakan variabel referensi untuk merujuk pada tipe yang lebih spesifik.
    Dan setiap kali kita melakukan ini, upcasting secara implisit terjadi.
    Upcasting adalah casting dari subclass ke superclass sementara downcasting adalah casting dari superclass ke subclass.
    */
    public static void main(String[] args) {
        Kucing anggora = new Kucing();

        Hewan hewan = anggora; //secara implisit upcasting
        hewan = (Hewan) anggora; //secara explisit melakukan casting dari subclass ke superclass

        Hewan hewan2 = new Kucing();
        ((Kucing) hewan2).meow(); //downcast hewan ke kucing, casting dari superclass ke subclass
    }
}
