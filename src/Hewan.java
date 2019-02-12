public class Hewan {
    String nama;
    int jumlahKaki,berat;

    public Hewan(String namaHewan){
        nama = namaHewan;
    }

     public void beratHewan(int beratHewan){
        berat=beratHewan;
     }

     public void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahKaki = jumlahKakiHewan;
     }

    public void cetakHewan(){
        System.out.println("Nama Hewan = "+nama);
        System.out.println("Berat Hewan = "+berat+" Kg");
        System.out.println("Jumlah Kaki = "+jumlahKaki);
    }

}
