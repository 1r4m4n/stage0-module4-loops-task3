package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int i = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        while (i < lastFibonacci) {
            System.out.println(a);
            c = b;
            b = a + b;
            a = c;
            i++;
        }
    }
}
