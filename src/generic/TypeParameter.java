package generic;

import java.util.ArrayList;
import java.util.List;

public class TypeParameter {

    public static void main(String[] args){
        List lo = new ArrayList(); // List tanpa type-parameter
        lo.add("lo - String 1"); // lo menampung objek String yang tidak bisa dicast ke object planet
        lo.add(new Planet("Mercury", 0.06)); // lo menampung objek Planet

        /*
        Dalam List lo ada objek yang tidak bisa di-cast ke Planet. maka akan error
        Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to generic.Planet
        */
        for (Object o : lo){
            Planet p = (Planet) o; // perlu type-casting dari Object ke Planet
            p.print();
        }

        List<Planet> lp = new ArrayList(); // List dengan type-parameter Planet
        lp.add(new Planet("Mercury", 0.06)); // lp menampung objek Planet
        //lp.add("lp - String 1"); // baris ini compile-error, lp tidak diijinkan menampung objek String
        lp.add(new Planet("Venus", 0.82)); // lp menampung objek Planet

        for (Planet p : lp){
            p.print();
        }
    }
}
