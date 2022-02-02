import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int ticketPrice = 100;
        int bonus = 20;
        long bonusMil = ticketPrice / bonus;
        System.out.println(bonusMil);
    }
}
