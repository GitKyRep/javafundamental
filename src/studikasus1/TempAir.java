package studikasus1;

import java.util.Scanner;

public class TempAir {
    public static void main(String[] args){

        //variable
        int T;

        //program
        System.out.println("Contoh if tiga kasus");
        System.out.print("Temperatur (der. C ) = ");

        //scnanner untuk memasukan temp air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();// masukan temperatur air dengan tipe int


        //proses pengecekan dengan if
        if(T<0){
            System.out.println("Wujud air Beku "+ T);
        }else if((0 <= T) && ( T <= 100)){
            System.out.println("Wujud air cair "+ T);
        }else if(T > 100){
            System.out.println("Wujud air uap/gas "+ T);
        }

    }
}
