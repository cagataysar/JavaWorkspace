public class Consumer implements Runnable {
    Data d;

    public Consumer (Data d) {
        this.d = d;
    }

    @Override
    public void run () {
        for (int i = 0; i < 10; i++) {
            synchronized (d) {
                if ( d.flag == true ) {
                    d.deger--;
                    System.out.println("Consumer -> " + d.deger);
                }
            }
        }
    }
}
