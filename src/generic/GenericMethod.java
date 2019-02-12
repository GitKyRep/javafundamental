package generic;

import java.util.*;

public class GenericMethod {

    //contoh Generic Methods.
    static <T> void arrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // baris ini valid
        }
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");


        print2(ls); // Baris ini valid

        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));


        print2(cp); // Baris ini valid


        /*================================================*/
        /*              generic method                    */
        /*================================================*/

        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList();


        // T inferred to be Object
        arrayToCollection(oa, co);


        String[] sa = new String[100];
        Collection<String> cs = new ArrayList();


        // T inferred to be String
        arrayToCollection(sa, cs);


        // T inferred to be Object
        arrayToCollection(sa, co);


        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList();


        // T inferred to be Number
        arrayToCollection(ia, cn);


        // T inferred to be Number
        arrayToCollection(fa, cn);


        // T inferred to be Number
        arrayToCollection(na, cn);


        // T inferred to be Object
        arrayToCollection(na, co);


        // compile-error
        //arrayToCollection(na, cs);
    }

    /*
    jika menggunakan print1 maka akan error print1 cannot be applied karena
    List<String> dan Collection<Planet> bukan turunan (subtype) dari Collection<Object>
    atau Collection<Object> bukan supertype dari Collection<Planet> dan List<String>.
    Lalu apa supertype dari semua tipe Collection? Hal ini dikenal dengan nama wildcard type,
    ditulis dengan syntax Collection<?> yang artinya collection of unknown.
    Kita tulis ulang sebagian kode di atas menggunakan wildcard type.

    */

    /*public static void print1(Collection<Object> collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }*/

    /*
    solusinya gunakan print 2 dimana ada perubahan sebagai berikut
    */

    public static void print2(Collection<?> collection) { // perubahan ada di baris ini
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
