public class TrackingAgent implements IAgent {
    private int rock = 0;
    private int paper = 0;
    private int scissors = 0;

    public HandShape nextMove() {
        if (rock > paper) {
            // rock is more frequently chosen than paper
            if (rock > scissors) {
                // rock is more frequently chosen than paper & scissors
                return HandShape.PAPER;
            } else {
                // rock is more frequently chosen than paper,
                // but scissors is chosen more frequently than rock
                return HandShape.ROCK;
            }
        } else {
            // paper is more frequently chosen than rock
            if (paper > scissors) {
                // paper is more frequently chosen than rock & scissors
                return HandShape.SCISSORS;
            } else {
                // paper is more frequently chosen than rock,
                // but scissors is chosen more frequently than paper
                return HandShape.ROCK;
            }
        }
    }
}
