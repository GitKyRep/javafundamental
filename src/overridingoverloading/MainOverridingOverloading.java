package overridingoverloading;

public class MainOverridingOverloading {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        hewan.makan(); // memanggil base method


        Kucing kucing = new Kucing();
        kucing.makan(); // memanggil method overriding
        kucing.makan("daging ikan"); // memanggil method overloading
    }
}
