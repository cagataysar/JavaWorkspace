import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
//        ornek1();
//        ornek2();
//        ornek3();
//        ornek4();
    }


    private static void ornek4 () {
        Tuple< Person, Vehicle > ikili = new Tuple<>();

    }

    private static void ornek3 () {
        Pair< Vehicle, Person > pair = new Pair<>();
        pair.setKey(new Vehicle());
        pair.setValue(new Person());

    }

    // Generic felaketi
    // ClassCastException alırız
    private static void ornek2 () {
        Pair< Vehicle, Person > pair = new Pair(new Person(), new Vehicle());
        Vehicle v = pair.getKey();
        System.err.println(v);
    }

    private static void ornek1 () {
    }
}