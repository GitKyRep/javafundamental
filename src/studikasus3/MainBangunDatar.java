package studikasus3;

import java.util.Scanner;

public class MainBangunDatar {
    private static  int pilihan;
    private static  Scanner scn = new Scanner(System.in);

    public static void mainMenu(){
        System.out.println("===========================");
        System.out.println("1. Menghitung luas persegi panjang");
        System.out.println("2. Menghitung luas segitiga");
        System.out.println("3. Menghitung luas lingkaran");
        System.out.print("Masukan menu : ");
        pilihan = scn.next().charAt(0);
    }
    public static void main(String[] args){
        PersegiPanjang persegiPanjang;
        SegitigaSiku segitigaSiku;
        Lingkaran lingkaran;
        int s1,s2,r;

        persegiPanjang = new PersegiPanjang();
        segitigaSiku = new SegitigaSiku();
        lingkaran = new Lingkaran();

        mainMenu();

        //kondisi untuk menu yang dimasukan

        switch (pilihan){
            case '1' :{
                System.out.print("Masukan panjang persegi :");
                s1 = scn.nextInt();
                System.out.print("Masukan panjang persegi :");
                s2 =scn.nextInt();
                System.out.println("Luas Persegi panjang :" + persegiPanjang.luas(s1,s2));
                System.out.println("Keliling Persegi panjang :" + persegiPanjang.keliling(s1,s2));
                break;
            }
            case '2' :{
                System.out.print("Masukan Alas segitiga:");
                s1 = scn.nextInt();
                System.out.print("Masukan tinggi segitiga :");
                s2 =scn.nextInt();
                System.out.println("Luas segitiga :" + segitigaSiku.luas(s1,s2));
                System.out.println("Keliling segitiga:" + segitigaSiku.keliling(s1,s2));
                break;
            }
            case '3' :{
                System.out.print("Masukan jari jari lingkaran:");
                r = scn.nextInt();
                System.out.println("Luas Lingkaran:" + lingkaran.luas(r));
                System.out.println("Keliling lingkaran :" + lingkaran.keliling(r));
                break;
            }default:{
                System.out.print("tidak ada pilihan");
                break;
            }
        }

    }
}
