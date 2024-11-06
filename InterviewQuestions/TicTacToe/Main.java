package InterviewQuestions.TicTacToe;

public class Main {
    public static void main(String[] args)
    {
        TicTacToeGame game=new TicTacToeGame();
        game.initializeGame();
    System.out.println("Winner Winner Chicken Dinner : " + game.startGame());
    }
}
