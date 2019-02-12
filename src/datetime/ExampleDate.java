package datetime;

/*
Merupakan kelas tertua yang menangani Waktu dan Tanggal.
Dalam penggunaannya sekarang sudah banyak method yang sudah deprecated karena adanya java.util.Calendar.
Kelas Calendar memiliki kemampuan penanganan waktu dan tanggal yang lebih baik.
Tetapi jangan kuatir, masih ada beberapa kebutuhan kode yang bisa diselesaikan dengan menggunakan Date
*/

import java.util.Date;

public class ExampleDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Tanggal sekarang adalah " + date.toString());

    }
}

