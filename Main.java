import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
       System.out.println("Enter Number of Dices");
       int n =sc.nextInt();
         Dices dice = new Dices(n);
         System.out.println("Enter no of players ");
         int n1=sc.nextInt();
         Map<String,Integer> playersCurrentPosition = new HashMap<>();
        Queue<Players> allPlayers = new LinkedList<>();
         for(int i=0;i<n1;i++){
           System.out.println("Name of the player"+(i+1));
          String p1=sc.next();
           Players p=new Players(p1);
           playersCurrentPosition.put(p1,0);
          allPlayers.add(p);
         }
         System.out.println("Enter no of Snakes");
         int n2=sc.nextInt();
        List<Ladrandsnake> snakes = new ArrayList<>();
        for(int i=0;i<n2;i++){
          System.out.println("Enter Start and end positions of snakes");
          int s=sc.nextInt();
          int s1=sc.nextInt();
          Ladrandsnake snake1=new Ladrandsnake(s,s1);
          snakes.add(snake1);
        }
        System.out.println("Enter no of ladders");
         int n3=sc.nextInt();
        List<Ladrandsnake> ladders = new ArrayList<>();
        for(int i=0;i<n3;i++){
          System.out.println("Enter Start and end positions ladders");
          int l=sc.nextInt();
          int l1=sc.nextInt();
          Ladrandsnake ladder1=new Ladrandsnake(l,l1);
        ladders.add(ladder1);
        }
        SnakeandladderBoard gb=new SnakeandladderBoard(dice,allPlayers,snakes,ladders, playersCurrentPosition,100);
        gb.startGame();
    }
}
