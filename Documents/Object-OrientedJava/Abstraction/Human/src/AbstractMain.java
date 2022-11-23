public class AbstractMain {
    public static void main (String[] args) {
        Kadin K = new Kadin();

        //anonymus class
        Insan i = new Insan() {
            @Override
            public void konus () {
                System.err.println("İnsan konuşuyor");
            }
        };
    }
}
