package InterviewQuestions.SnakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    Board(int boardSize,int numberOfSnakes,int numberOfLadder)
    {
        initializeCells(boardSize);
        addSnakesLadders(cells,numberOfSnakes,numberOfLadder);
    }
    public void initializeCells(int boardSize)
    {
        cells =new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++)
        {
            for(int j=0;j<boardSize;j++)
            {
                Cell cellObj = new Cell();
                cells[i][j]=cellObj;
            }
        }
    }
    public void addSnakesLadders(Cell[][] cells,int numberOfSnakes,int numberOfLadders)
    {
        int n=cells.length;
        while(numberOfSnakes > 0)
        {
            int snakeHead = ThreadLocalRandom.current().nextInt(1,n*n-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, n*n-1);
            if(snakeTail > snakeHead)
            {
                continue;
            }
            Jump snakeObj=new Jump();
            snakeObj.start=snakeHead;
            snakeObj.end=snakeTail;

            Cell cell=getCell(snakeHead);
            cell.jump = snakeObj;
            numberOfSnakes--;
        }
        while(numberOfLadders > 0)
        {
            int ladderHead = ThreadLocalRandom.current().nextInt(1,n*n-1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1,n*n-1);
            if(ladderHead >= ladderTail) continue;

            Jump ladderObj=new Jump();
            ladderObj.start = ladderHead;
            ladderObj.end = ladderTail;
            
            Cell cell=getCell(ladderHead);
            cell.jump = ladderObj;
            numberOfLadders--;
        }
    }

    public  Cell getCell(int playerPosition)
    {
        int boardRow = playerPosition / cells.length;
        int boardColumn = playerPosition % cells.length;
        return cells[boardRow][boardColumn];
    }
}
