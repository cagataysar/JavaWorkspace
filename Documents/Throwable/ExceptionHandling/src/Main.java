import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main (String[] args) {
       /*
        try {
            ornek1(7, 0);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        */
//        ornek2();
//        ornek3();
//        ornek4();
//        ornek5();
//        ornek6();
    }

    private static void ornek6 () {
        try {
            recursive();
        } catch (Error e) {
            System.err.println(e.getClass());
        }
    }

    private static void recursive () {
        recursive();
    }

    private static void ornek5 () {
        // multi-catch exception
        try {
            if ( new Random().nextBoolean() ) {
                if ( new Random().nextBoolean() ) {
                    int sayi = 7 / 0;
                } else {
                    List< String > liste = new ArrayList<>();
                    LinkedList< String > liste2 = (LinkedList< String >) liste;
                }
            } else {
                ArrayList< String > liste = null;
                liste.add("hamit");
            }
        } catch (NullPointerException | ArithmeticException e) {
            System.err.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
        /* catch (ClassCastException e) {
            e.printStackTrace();
        } */ catch (Exception e) {
            System.err.println("Tepeden exception yakaladim");
        }
    }

    private static void ornek4 () {
        // sıralama önemli. Bu multi-catch değil.
        try {
            // asagidan yukari birden fazla catch blogu yazilabilir
            if ( new Random().nextBoolean() ) {
                if ( new Random().nextBoolean() ) {
                    int sayi = 7 / 0;
                } else {
                    List< String > liste = new ArrayList<>();
                    LinkedList< String > liste2 = (LinkedList< String >) liste;
                }
            } else {
                ArrayList< String > liste = null;
                liste.add("hamit");
            }
        } catch (NullPointerException e) {
            System.err.println(e.getLocalizedMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.err.println("Sayı 0 'a bolunmez");
        } catch (Exception e) {
            System.err.println("Tepeden exception yakaladim");
        }
    }

    private static void ornek3 () {
        try {
            if ( new Random().nextBoolean() ) {
                int sayi = 7 / 0;
            } else {
                ArrayList< String > liste = null;
                liste.add("hamit");
            }
        } catch (Exception e) {
            System.err.println("------> " + e.getMessage());
            if ( e instanceof NullPointerException ) {
                System.err.println(e.getLocalizedMessage());
                e.printStackTrace();
            } else if ( e instanceof ArithmeticException ) {
                System.err.println("Sayı 0 'a bolunmez");
            }
        }
    }

    private static void ornek2 () {
        System.err.println(bolmeIslemi(7, 0));
    }

    private static double bolmeIslemi (int i, int j) {
//        int temp = 1;
        String isim = "yasin";
        double sonuc;
        try {
//            temp = 5;
            isim = "Tuba";
            sonuc = i / j;
            System.err.println("Catch 'e dusmedik");
        } catch (Exception e) {
            // temp tekrar 1 'e atanmaz, bizim atamamiz gerekir
            // bir anlamda rollback
//            temp = 1;
            isim = "yasin";
            sonuc = 0;
            System.err.println("Catch 'e dustuk");
        } finally {
            // try 'da olsa catch de olsa calisacak
            System.err.println("Islem tamamlandi");
        }
        System.err.println(isim);
//        System.err.println(temp);
        return sonuc;
    }

    private static void ornek1 (int sayi1, int sayi2) {
        /*StackTraceElement[] stck = Thread.getAllStackTraces().get(Thread.currentThread());
        for (StackTraceElement stackTraceElement : stck) {
            System.err.println(stackTraceElement);
        }*/
        int k = sayi1 / sayi2;
        //        new Exception("jfsgss").printStackTrace(); // bu şekilde yazılabilir
    }
}
