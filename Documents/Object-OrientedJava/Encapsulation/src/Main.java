public class Main {
    public static void main (String[] args) {
        Person p = new Person();
        p.setTcNo("12345678912");
        System.out.println(p.getTcNo());
        p.setIsim("Veli");
        System.out.println(p.getIsim());

//        Person2 p2 = new Person2("Ali", 23);
//        System.out.println(p2.isim);
    }

    record Person2(String isim, int yas) {

    }
}