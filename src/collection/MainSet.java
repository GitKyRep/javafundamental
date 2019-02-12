package collection;

import java.util.*;

public class MainSet {

    public static void main(String[] args){
        //menggunakan hashset
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); //method add untuk menambahkan object
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); //menambahkan object earch beberapa kali untuk membuktikan bahwa set itu anya akan menyimpan objek tersebut satu kali saja tidak bisa duplikat
        planets.add("earth");
        planets.add("mars");

        //method size untuk mendapatakan ukuran set
        System.out.println("set planet awal : (Size = "+planets.size()+" )");
        for (String planet : planets){
            System.out.println("\t "+planet);
        }

        planets.remove("venus");//method remove untuk mengeluarkan object dari set

        System.out.println("set planet awal : (Size = "+planets.size()+" )");

        for (Iterator iterator = planets.iterator();iterator.hasNext();){
            System.out.println("\t "+iterator.next());
        }
    }
}
