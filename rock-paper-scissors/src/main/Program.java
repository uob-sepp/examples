public class Program {

    public static Winner determineWinner(HandShape p1, HandShape p2) {
        if (p1 == HandShape.ROCK) {
            if (p2 == HandShape.ROCK)
                return Winner.DRAW;
            else if (p2 == HandShape.PAPER)
                return Winner.PLAYER_TWO;
            else
                return Winner.PLAYER_ONE;
        } else if (p1 == HandShape.SCISSORS) {
            if (p2 == HandShape.SCISSORS)
                return Winner.DRAW;
            else if (p2 == HandShape.ROCK)
                return Winner.PLAYER_TWO;
            else
                return Winner.PLAYER_ONE;
        } else {
            if (p2 == HandShape.PAPER)
                return Winner.DRAW;
            else if (p2 == HandShape.SCISSORS)
                return Winner.PLAYER_TWO;
            else
                return Winner.PLAYER_ONE;
        }
    }

    public static void main(String[] args) {
        IAgent player1 = new AlwaysPaperAgent();
        IAgent player2 = new RandomAgent();

        switch (determineWinner(player1.nextMove(), player2.nextMove())) {
            case PLAYER_ONE:
                System.out.println("Player 1 wins!");
                break;
            case PLAYER_TWO:
                System.out.println("Player 2 wins!");
                break;
            case DRAW:
                System.out.println("It's a draw!");
                break;
        }
    }
}
