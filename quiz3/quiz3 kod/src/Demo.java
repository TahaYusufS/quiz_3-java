import java.lang.reflect.Array;

public class Demo {
    public static void main(String[] args) {

        Player[] players=new Player[4];

        FootballPlayer foot1=new FootballPlayer("Messi","forward","Inter Miami",200,43,69);
        FootballPlayer foot2=new FootballPlayer("Ronaldo","forward","Al-Nassr",194,34,75);

        BasketballPlayer basket1=new BasketballPlayer("Lebron james","shooting guard","Los Angeles Lakers",130,78,65,164);
        BasketballPlayer basket2=new BasketballPlayer("Stephen Curry","shooting guard","Golden State Warriors",110,54,49,125);


        Array.set(players,0,foot1);
        Array.set(players,1,foot2);
        Array.set(players,2,basket1);
        Array.set(players,3,basket2);



        for (Player player:players){
            System.out.println("-----------------------------------------------------------");
            System.out.println("\n");
            System.out.println(player.toString());
            System.out.println("\n");
            player.doTraining();
            System.out.println(player.getName()+" after training: ");
            System.out.println("\n");
            System.out.println(player.toString());
            System.out.println("\n");
            System.out.println("\n");
        }
        System.out.println("-----------------------------------------------------------");








    }
}