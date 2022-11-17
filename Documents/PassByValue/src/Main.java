public class Main {
    public static void main(String[] args) {
        //ornek1();
        //ornek2();
        ornek4();
    }
    private static void ornek4() {
        int[] sayilar = new int[] { 1, 2, 3 };
        doStuff(sayilar);
        System.err.println(sayilar[0] + " - " + sayilar[1] + " - " + sayilar[2]);
    }
    private static void doStuff(int[] sayilar) {
        sayilar = new int[] { 4, 5, 6 };
        // sayilar[1] = 10;
        System.err.println("-> "+ sayilar[0] + " - " + sayilar[1] + " - " + sayilar[2]);
    }
    private static void ornek2() {

    }
    private static void ornek1() {
        Integer temp = 4;
        doStuff(temp);
        System.err.println(temp);
    }
    public static void doStuff(Integer sayi) {
        sayi = sayi + 1;
        System.err.println("-> " + sayi);
        sayi = null;
    }
}