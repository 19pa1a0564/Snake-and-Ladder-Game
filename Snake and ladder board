import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.*;
class SnakeandladderBoard {
    private Dices dice;
    private Queue<Players> nextTurn;
    private List<Ladrandsnake> snakes;
    private  List<Ladrandsnake> ladders;
    private  Map<String,Integer> playersCurrentPosition;
    int boardSize;

     SnakeandladderBoard(Dices dice, Queue<Players> nextTurn, List<Ladrandsnake> snakes, List<Ladrandsnake> ladders,Map<String,Integer> playersCurrentPosition,int boardSize) {
        this.dice = dice;
        this.nextTurn = nextTurn;
        this.snakes = snakes;
        this.ladders = ladders;
        this.playersCurrentPosition = playersCurrentPosition;
        this.boardSize = boardSize;
    }
     void startGame(){
        while(nextTurn.size()>1) {
            Players player = nextTurn.poll();
            int currentPosition = playersCurrentPosition.get(player.getPlayerName());
            int diceValue = dice.rollDice();
            int nextCell = currentPosition + diceValue;
            if (nextCell > boardSize) nextTurn.offer(player);
            else if (nextCell == boardSize) {
                System.out.println( player.getPlayerName() + " won the game");
            }else{
               int[] nextPosition= new int[1];
               boolean[] b =new boolean[1];
                nextPosition[0]= nextCell;
               snakes.forEach(v-> {
                   if(v.startPoint==nextCell) {
                       nextPosition[0] = v.endPoint;
                   } } );
               if(nextPosition[0] != nextCell) System.out.println("Oh!"+player.getPlayerName() + " Snake bits at: "+ nextCell);
                ladders.forEach(v-> {
                    if(v.startPoint==nextCell) {
                        nextPosition[0] = v.endPoint;
                        b[0]=true;
                    } } );
                if(nextPosition[0] != nextCell && b[0]) System.out.println("Hey"+player.getPlayerName() + "got ladder  at: "+ nextCell);
                if(nextPosition[0] == boardSize){
                    System.out.println("congrats!"+player.getPlayerName() + " won the game");
                }else{
                    playersCurrentPosition.put(player.getPlayerName(),nextPosition[0]);
                     System.out.println(player.getPlayerName() + " is at position "+ nextPosition[0]);
                    nextTurn.offer(player);
                }
            }
        }
    }
}
