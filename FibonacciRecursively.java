import java.util.*;
public class FibonacciRecursively{
    public static void main(String[] args) {
        fibFinder(3);
    }
    public static int fibFinder(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 0) {
            return 0;
        }
        return fibFinder(num - 1) + fibFinder(num - 2);
    }
}