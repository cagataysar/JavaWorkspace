public class Main {
    public static void main (String[] args) {
//        ornek1();
//        ornek2();
//        ornek3();
//        ornek4();

//        integer döndürür
        Integer.valueOf(3);
//        int döndürür
        Integer.parseInt("3");
    }

    private static void ornek4 () {
        Integer objectSayi = null;
        int primitiveSayi = objectSayi;
        islem2(primitiveSayi);
        islem2(objectSayi);
    }

    public static void islem2 (Integer sayi) {
        if ( sayi == null ) {
            System.err.println("Sayı null geldi");
            return;
        }
        if ( sayi > 10 ) {
            System.err.println("Sayı > 10");
        } else {
            System.err.println("Sayı <= 10");
        }
    }

    private static void ornek3 () {
        Integer objectsayi = null;
        // görmesek de objectsayi.intValue() metodu burada var
        islem(objectsayi); // NullPointerException
    }

    public static void islem (int sayi) {
//        hiçbir şekilde null gelemiyor
//        if ( sayi == null ) {
//            System.err.println("Sayı null geldi");
//        }
//         disardan null gelirse disarda patliyor
        if ( sayi > 10 ) {
            System.err.println("Sayı > 10");
        } else {
            System.err.println("Sayı <= 10");
        }
    }

    private static void ornek2 () {
        // unnecessary boxing
        Integer sayi = Integer.valueOf(3);
        int sayi2 = Integer.valueOf(3);
        System.err.println(sayi2);
    }

    private static void ornek1 () {
        int primitive = 4;
        Integer sayi = primitive;
        sayi.intValue();
    }
}