public class Main {
    public static void main(String[] args) {

        int result = getFibonacciSequence(10);
        System.out.println("The nth term of the term of the Fibonaccia sequenc is: "+ result);
    }

    static int getFibonacciSequence(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return getFibonacciSequence(n - 1) + getFibonacciSequence(n - 2);
    }
}
