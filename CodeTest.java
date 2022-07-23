import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CodeTest {
    
    public static final int NUMBERS = 66;
    public static final int MAX_NUMBERS = 40;
    public static final int PRIZE = 100;
    
    public static void main(String[] args) {






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


    // reading players lottery ticker from console
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
