import java.util.*;
public class FibonacciIteratively{
    public static void main(String[] args) {
        fibFinder(7);
    }
    public static void fibFinder(int num) {
        int a = 0;
        int b = 1;
        int combo = 1;
        if (num == 0) {
            System.out.print("0");
        }
        if (num == 1) {
            System.out.print("1");
        }
        else{ for (int i=1; i <= num - 1; i++) {
            combo = a + b;
            a = b;
            b = combo;
        }
        System.out.println(combo);
        }
    }
}