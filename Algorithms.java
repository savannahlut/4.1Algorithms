import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;  
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigits = twoDigits();
        int greater500 = greaterThan(500);
        int greatest = greatest(); 
        int lowest = least(); 
        System.out.println("Odds: " + odds);
        System.out.println("Evens: " + evens);
        System.out.println("Double Digits: " + twoDigits);
        System.out.println("Greater than 500: " + greater500);
        System.out.println("The Greatest Value: " + greatest);
        System.out.println("The Lowest Value: " + lowest);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twoDigits() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigits = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 9 && s.nextInt() < 100)
                twoDigits++;
        }
        return twoDigits;
    }

    public static int greaterThan(int num) throws FileNotFoundException{
        s = new Scanner(f);
        int greater = 0;
        while (s.hasNext()) {
            if (s.nextInt() > num)
                greater++;
        }
        return greater;
    }

    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = Integer.MIN_VALUE;
        while (s.hasNext()) {
            if (s.nextInt() > greatest)
            greatest = s.nextInt();
        }
        return greatest;
    }

    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = Integer.MAX_VALUE;
        while (s.hasNext()) {
            if (s.nextInt() < least)
                least = s.nextInt();
        }
        return least;
    }
}