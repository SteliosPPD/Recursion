package recursion;

public class Recursion {

    public static void main(String[] args) {

        long result = factorial(4);
        System.out.println(result);

    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return (n * factorial(n - 1));
    }

}
