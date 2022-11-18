import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Basit dizi kullanımından daha fazla metodu vardır.
 */
public class ListClass {

    public static void main(String[] args) {
        //ornek1();
        //ornek2();
        //ornek3();
        //ornek4();
        //pornek5();
    }

    private static void ornek5() {
        LinkedList<Integer> sayilar = new LinkedList<>();
        sayilar.add(6);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(9);
        //sayilar.removeFirst();
        sayilar.addFirst(12);
        //System.out.println(sayilar.getLast());
        System.out.println(sayilar);

    }

    private static void ornek4() {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(6);
        sayilar.add(5);
        System.out.println(sayilar);
        sayilar.remove((Integer) 6);
        System.out.println(sayilar);

    }

    private static void ornek3() {
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Ahmet");
        isimler.add("Zehra");
        isimler.add("Numan");
        isimler.add("Buğra");
        Collections.sort(isimler);
        System.out.println(isimler);
    }

    private static void ornek2() {
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("23");
        System.out.println(isimler.get(1));
        System.out.println(isimler.contains("23"));

        //System.out.println(isimler);
    }

    private static void ornek1() {
        //Person[] kisiler = new Person[4];
        //System.err.println(kisiler);
        ArrayList isimler = new ArrayList();
        isimler.add("Ahmet");
        isimler.add("Sedanur");
        // System.err.println(isimler);
        isimler.add("Furkan");
        isimler.remove("Ahmet");
        isimler.remove(0);
        for (Object isim : isimler) {
            System.err.println(isim);
        }
    }
}

class Person {
    public int yas;
    public String isim;
}