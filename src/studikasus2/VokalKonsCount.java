package studikasus2;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class VokalKonsCount {
    public static void main(String[] args){
        String word;
        int vokal=0;
        int konsonan=0;

        //masukan kalimat
        System.out.print("Masukan kalimat yang mau dihitung hurufnya : ");
        Scanner scn = new Scanner(System.in);
        word=scn.nextLine();

        //memanggil prosedur yang mengembalikan nilai int
        vokal=num_vokal(word);
        konsonan=num_konsonan(word);

        System.out.println("Jumlah huruf Vokal : "+vokal);
        System.out.println("Jumlah huruf Konsonan : "+konsonan);
    }

    private static int num_vokal(@NotNull String word){
        int i;
        int jumlah_vokal = 0;

        for(i=0;i<word.length();i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='i'|| word.charAt(i)=='u'|| word.charAt(i)=='e'|| word.charAt(i)=='o'){
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }

    private static int num_konsonan(@NotNull String word){
        int i;
        int jumlah_konsonan = 0;

        for(i=0;i<word.length();i++){
            char ch =  word.charAt(i);
            if(word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o' && word.charAt(i) != ' '){
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }
}
