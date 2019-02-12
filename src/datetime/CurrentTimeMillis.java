package datetime;

/*
System.currentTimeMillis()
Method yang mengembalikan waktu sekarang dalam millisecond
Merupakan method bagian dari kelas System yang menampilkan
waktu sekarang dalam satuan milisecond (1000 milisecond = 1 second).
CurrentTimeMillis() mengembalikan jumlah waktu mulai dari 1-1-1970 sampai dengan waktu yang sekarang.
System.currentTimeMillis() biasanya digunakan untuk mengukur suatu waktu yang dibutuhkan dengan lebih spesifik.
Ia biasa juga dipakai untuk tambahan sebagai variabel unik.

*/
public class CurrentTimeMillis {
    public static void main(String[] args) {
        long timeNow = System.currentTimeMillis();

        System.out.println("Waktu sekarang adalah " + timeNow + " milisecond");
    }
}
