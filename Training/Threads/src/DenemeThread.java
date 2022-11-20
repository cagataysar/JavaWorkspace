public class DenemeThread {
    public static void main (String[] args) {
        Data d = new Data();
        d.deger = 100;
        d.flag = false;
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        Thread t = new Thread(c);
        p.start();
        t.start();
    }
}
