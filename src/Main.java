public class Main {


    public static void main(String[] args) {
        Hewan elang = new Hewan("elang");
        Hewan kucing = new Hewan("Kucing");

        elang.beratHewan(5);
        elang.jumlahKakiHewan(2);
        elang.cetakHewan();

        kucing.beratHewan(2);
        kucing.jumlahKakiHewan(4);
        kucing.cetakHewan();
    }
}
