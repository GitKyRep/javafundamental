package overridingoverloading;

class Kucing extends Hewan {
    /*
    overriding => mengubah isi metode
    overloading => menambah metode sejenis (nama yang sama tetapi berbeda parameter).
    */

    public void makan() { // overriding
        System.out.println("Kucing sedang makan..");
    }

    public void makan(String food) { // overloading
        System.out.println("Kucing makan " + food);
    }
}