import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CodeTest {
    
    public static final int NUMBERS = 66;
    public static final int MAX_NUMBERS = 40;
    public static final int PRIZE = 100;
    
    public static void main(String[] args) {

 // 3 method to get winning number and getTickets

 Set<Integer> winning = createWinningNumbers();
 Set<Integer> ticket = getTickets();

 // 4 keep only winning tickets

 Set<Integer> matches = new TreeSet<>(ticket);
 matches.retainAll(winning);

 // 5 calculating the prize and
 System.out.println("Your tickets was:"  +ticket);
 System.out.println("Winning number is :"  +winning);
if (matches.size() >0){

    double prize = PRIZE * Math.pow(2, matches.size());
    System.out.println("Matched numbers: " +matches);
    System.out.printf("Your prize is $%.2f\n", prize );
}



    }


    // 1 genere un set de nulero gagnant
    public static Set<Integer> createWinningNumbers(){
        Set<Integer> Winning = new TreeSet<>() ;
        Random random = new Random();


        while (Winning.size() < NUMBERS) {
            int number = random.nextInt(MAX_NUMBERS) + 1;
        }
        return Winning;
    } 


    // 2 reading players lottery ticker from console
    public static Set<Integer> getTickets(){
        Set<Integer> ticket = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your lottery ticket" +NUMBERS + "please");

        while (ticket.size() < NUMBERS) {
            int number = scanner.nextInt();
            ticket.add(number);
            
        }

        return ticket;
    }



}
