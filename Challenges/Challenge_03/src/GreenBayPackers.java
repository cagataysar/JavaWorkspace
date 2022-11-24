public class GreenBayPackers {
    public static void main (String[] args) {
        QuarterBack qb = new QuarterBack();
        qb.setName("Aaron Rodgers");
        qb.setNumber(12);
        qb.passTheBall(5);

        RunningBack rb = new RunningBack();
        rb.setName("Aaron Jones");
        rb.setNumber(23);
        rb.runWithBall(34);

        LineBacker lb = new LineBacker();
        lb.setName("Jonathan Garvin");
        lb.setNumber(53);
        lb.makeTackle();
    }
}
