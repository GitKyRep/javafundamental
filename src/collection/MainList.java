package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainList {

    public static void main(String[] args){
        Collection collection;

        //deklatasi array
        String[] heroes = new String[2];
        heroes[0]="riki";
        heroes[1]="riki";
        //heroes[2]="riki"; //akan muncul error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        //menggunakan arraylist
        List planets = new ArrayList();

        planets.add("mercury"); //method add untuk menambahkan object kedalam list
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); //object lainnya bisa terus ditambahkan ke list

        System.out.println("List pelanet awal");

        //method planets.size() untuk mendapatkan ukuran dari list / count list
        for(int i=0;i < planets.size();i++){
            System.out.println("\t index-"+ i +" = "+planets.get(i));
        }

        planets.remove("venus"); //method remove() untuk mengeluarkan object dari list yang ada

        System.out.println("List pelanet Akhir");

        //method planets.size() untuk mendapatkan ukuran dari list / count list
        for(int i=0;i < planets.size();i++){
            System.out.println("\t index-"+ i +" = "+planets.get(i));
        }

    }
}
