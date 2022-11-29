public class QuarterBack extends OffensivePlayer implements OffensiveGame {

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

    @Override
    public void trainOffensivePlans () {
        System.out.println("Working on offensive plans. ");
    }
}
