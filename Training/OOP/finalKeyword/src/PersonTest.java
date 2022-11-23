public class PersonTest {
    public static void main (String[] args) {
        Person p = new Person();
        p.setName("Mahmut");
        p.getName();
        Person p2 = new Person("Hayrullah", 43);
        p2.getName();
    }
}
