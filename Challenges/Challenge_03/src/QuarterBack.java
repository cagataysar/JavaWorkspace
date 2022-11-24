public class QuarterBack extends OffensivePlayer {

    @Override
    public void passTheBall (int distanceOfPass) {
        super.distanceOfPass += distanceOfPass;
        System.out.println(super.getName() + " passing " + distanceOfPass + " yard.");
    }

    @Override
    public void runWithBall (int distanceOfRunning) {
        this.distanceOfRunning += distanceOfRunning;
        System.out.println(super.getName() + " running " + distanceOfRunning + " yard.");
    }
}
