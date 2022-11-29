public class OffensivePlayer extends Player implements OffensiveGame {
    protected int distanceOfPass = 0;
    protected int distanceOfRunning = 0;


    // iki hücumu aynı anda yapamayacağı için abstract yapmadım.
    // override'a zorlamak istemiyorum
    public void runWithBall (int distanceOfRunning) {
    }

    public void passTheBall (int distanceOfPass) {
    }

    public void catchTheBall () {
    }

    @Override
    public void personalTraining () {
        System.out.println("Packing on some muscles.");
    }

    @Override
    public void catchTheBallThatKicked () {

    }

    @Override
    public void trainOffensivePlans () {
    }


}
