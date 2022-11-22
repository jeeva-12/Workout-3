package sportstars;
import sports.*;
import sports.outdoorgames;

public class main
{
    public static void main(String[] args) {
        circket cricket = new circket();
        cricketer c1 = new cricketer(cricket, "Jahangir","Indian",3.5,8.5 );
        c1.calculateRating(c1.battingAverage, c1.bowlingAverage);
        System.out.println(c1.rating);
        c1.income(c1.rating);

        outdoorgames Football = new football();
        footballer f1 = new footballer(Football, "Messi", "Argentina", 10, 0);
        f1.calculateRating(f1.goalsSaved,f1.goalsScored);
        System.out.println(f1.rating);
        f1.income(f1.rating);
    }
}
