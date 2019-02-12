package collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args){
        //menggunakan hashmap
        Map<String,Planet> planets = new HashMap<>();
        planets.put("key-1",new Planet("Mercury",0.06));//method put() untuk menambahkan object ke map
        planets.put("key-2",new Planet("Venus",0.82));//method put() untuk menambahkan object ke map
        planets.put("key-3",new Planet("Earth",1.00));//method put() untuk menambahkan object ke map
        planets.put("key-4",new Planet("Mars",0.11));//method put() untuk menambahkan object ke map
        planets.put("key-4",new Planet("Mars-X",0.11));//menambah ke maps dengan key yang sama

        //method size untuk mendapatkan ukuran maps
        System.out.println("maps planet awal : ( Size ="+planets.size()+" )");

        for (String key:planets.keySet()){ //looping key dari map
            //method get() untuk melihat isi maps berdasarkan key
            System.out.println("\t "+ key+" : "+planets.get(key));
        }

        planets.remove("key-2"); //method remove untuk mengeluarkan object dari map

        //method size untuk mendapatkan ukuran maps
        System.out.println("maps planet akhir : ( Size ="+planets.size()+" )");

        for (String key:planets.keySet()){ //looping key dari map
            //method get() untuk melihat isi maps berdasarkan key
            System.out.println("\t "+ key+" : "+planets.get(key));
        }
    }

}
