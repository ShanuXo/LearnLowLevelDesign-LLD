package InterviewQuestions.SnakeLadder;

import java.util.Deque;
import java.util.LinkedList;

public class GameSetUp {
    Board board;
    Dice dice;
    Deque<Player> playerList = new LinkedList<>();
    Player winner;

    public GameSetUp()
    {
        initializeGame();
    }

    private void initializeGame()
    {
        board = new Board(10,5,4);
        dice=new Dice(1);
        winner = null;
        addPlayers();
    }
    private void addPlayers()
    {
        Player p1=new Player("p1",0);
        Player p2=new Player("p2",0);

        playerList.add(p1);
        playerList.add(p2);
    }

    public void startGame()
    {
        int n=board.cells.length;
        while(winner == null)
        {
            //Check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("Player Turn is  : " + playerTurn.playerId + " " + "Current Position is : " + playerTurn.currentPosition);

            //Roll the Dice 
            int diceNumber = dice.rollDice();
            
            //Get the new Postion
            int playerNewPosition = playerTurn.currentPosition+diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println("Player Turn is  : " + playerTurn.playerId + "Current Position is : " + playerNewPosition);

            if(playerNewPosition >= n-1){
                winner = playerTurn;
            }
        }
        System.out.println("WINNER IS : "+ winner.playerId);
    }
    private Player findPlayerTurn()
    {
        Player playerTurn = playerList.removeFirst();
        playerList.addLast(playerTurn);
        return playerTurn;
    }
    private int jumpCheck(int playerNewPosition)
    {
        int n=board.cells.length;
        if(playerNewPosition > n*n-1) return playerNewPosition;

        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump != null && cell.jump.start == playerNewPosition)
        {
            String jumpBy = (cell.jump.start < cell.jump.end) ? "Ladder" : "Snake";
            System.out.println("Jump Caused By -> " + jumpBy);

            return cell.jump.end;
        }
        return playerNewPosition;
    }
}
