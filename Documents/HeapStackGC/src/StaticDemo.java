/**
 * A static method cant access a non static(instance)
 * variable or method , because there is no instance!
 */
public class StaticDemo {
    static int count = 0;

    StaticDemo() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println(count);
        new StaticDemo();
        new StaticDemo();
        new StaticDemo();
        System.out.println(count);

    }


}
