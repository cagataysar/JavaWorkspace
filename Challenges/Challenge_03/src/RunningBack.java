public class RunningBack extends OffensivePlayer {

    @Override
    public void runWithBall (int distanceOfRunning) {
        super.distanceOfRunning += distanceOfRunning;
        System.out.println(super.getName() + " running " + distanceOfRunning + " yard.");
    }
}
