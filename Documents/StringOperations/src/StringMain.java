public class StringMain {
    public static void main (String[] args) {
//        immutabilityExample();
//        varyasyonlar();
//        varyasyonlar2();
    }

    private static void varyasyonlar2 () {
        // string metodları her seferinde yeni referanslara gider
        String lol = "lol";
        System.out.println(lol.toUpperCase() == lol);
        System.out.println(lol.toUpperCase() == lol.toUpperCase());
        System.out.println(lol.toUpperCase().equals(lol));
        System.out.println(lol.toUpperCase().equals(lol.toUpperCase()));
        System.out.println(lol.toUpperCase().equalsIgnoreCase(lol));
        System.out.println(lol.toUpperCase().equalsIgnoreCase(lol.toUpperCase()));
    }

    private static void varyasyonlar () {
        String a = "asd";
        String b = new String(a);
        String c = new String("asd");
        String d = a.substring(0);
        String e = "a" + "s" + "d";
//         == ile referansları kıyaslanır, equals ile değerleri
//        System.out.println("a == e -> " + (a == e));
//        System.out.println("a == b -> " + (a == b));
//        System.out.println("b == c -> " + (b == c));
//        System.out.println("a == \"asd\" -> " + (a == "asd"));
//        System.out.println("b == \"asd\" -> " + (b == "asd"));
//        System.out.println("c == \"asd\" -> " + (c == "asd"));
//        System.out.println("d == \"asd\" -> " + (d == "asd"));
//        System.out.println("e == \"asd\" -> " + (e == "asd"));
//        System.out.println("a.equals(\"asd\") -> " + a.equals("asd"));
//        System.out.println("b.equals(\"asd\") -> " + b.equals("asd"));
//        System.out.println("c.equals(\"asd\") -> " + c.equals("asd"));
//        System.out.println("d.equals(\"asd\") -> " + d.equals("asd"));
//        System.out.println("d.equals(\"asd\") -> " + e.equals("asd"));
//         string içerisinde equals ezilmiş ve karakter karakter karşılaştırma yapıyor
//         string 'ler immutable 'dır ve her seferinde yeni string nesnesi üretir
//        System.out.println("a.equals(b) -> " + a.equals(b));
//        System.out.println("a.equals(c) -> " + a.equals(c));
//        System.out.println("a.equals(d) -> " + a.equals(d));
//        System.out.println("a.equals(e) -> " + a.equals(e));
//        System.out.println("b.equals(c) -> " + b.equals(c));
//        System.out.println("b.equals(d) -> " + b.equals(d));
//        System.out.println("b.equals(e) -> " + b.equals(e));
//        System.out.println("c.equals(d) -> " + c.equals(d));
//        System.out.println("c.equals(e) -> " + c.equals(e));
//        System.out.println("d.equals(e) -> " + d.equals(e));
//        String isim = "deniz";
//        String isim2 = "şeniz";
//        isim2 = isim2.replace("ş", "d");
//        System.err.println(isim2);
//        System.err.println(isim == isim2);
//        System.err.println(isim.equals(isim2));
    }

    private static void immutabilityExample () {
        String temp = "seda";
        String temp2 = "seda";
        System.out.println(temp == temp2);
        temp += "a";
        temp2 = "sedaa";
//        System.err.println(temp);
//        System.err.println(temp2);
        System.out.println(temp == temp2);
        System.out.println(temp.equals(temp2));
    }
}
