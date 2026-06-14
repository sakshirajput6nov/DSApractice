
import java.util.*;

public class towerOfHanoi {

    public void towerOfHanoiMethod(int n, char a, char b, char c) {

        // Base case
        if (n == 1) {
            System.out.println(
                "Move disk - " + n + " from pole " + a + " to " + c
            );
        } 
        else {

            // Move n-1 disks from A to B using C
            towerOfHanoiMethod(n - 1, a, c, b);

            // Move nth disk from A to C
            System.out.println(
                "Move disk - " + n + " from pole " + a + " to " + c
            );

            // Move n-1 disks from B to C using A
            towerOfHanoiMethod(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {

        int n;

        towerOfHanoi t = new towerOfHanoi();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of disks : ");

        n = sc.nextInt();

        t.towerOfHanoiMethod(n, 'A', 'B', 'C');

        sc.close();
    }
}