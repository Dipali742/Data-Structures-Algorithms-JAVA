import java.io.*;
import java.util.*;

public class Main {

    static void setUp() {
        try{
            boolean isOnlineJudge = System.getProperty("ONLINE_JUDGE") != null;
            if (!isOnlineJudge) {
                System.setIn(new FileInputStream("./resources/input.txt"));
                System.setOut(new PrintStream(new FileOutputStream("./resources/output.txt")));
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        setUp();
       Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n <= 2) {
            System.out.println("NO");
        } else if (n % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}