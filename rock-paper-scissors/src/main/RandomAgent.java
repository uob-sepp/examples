import java.util.concurrent.*;

public class RandomAgent implements IAgent {
    private ThreadLocalRandom random;

    public RandomAgent() {
        this.random = ThreadLocalRandom.current();
    }

    public HandShape nextMove() {
        int n = this.random.nextInt(3);

        if (n == 0) {
            return HandShape.ROCK;
        } else if (n == 1) {
            return HandShape.PAPER;
        } else {
            return HandShape.SCISSORS;
        }
    }
}
