public class Producer extends Thread {
    Data d;

    public Producer (Data d) {
        this.d = d;
    }

    public void run () {
        for (int i = 0; i < 10; i++) {
            synchronized (d) {
                if ( d.flag == false ) {
                    d.deger++;
                    System.out.println("Producer -> " + d.deger);
                }
            }
        }
    }
}
