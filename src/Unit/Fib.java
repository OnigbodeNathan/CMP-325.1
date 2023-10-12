package Unit;

public class Fib {
    public int Fibo(int numbers) {
        int first = 0;
        int second = 1;

        int next = 0;
        for (int i = 0; i < numbers; i++) {
            if (i < 2) {
                System.out.println(i);

            } else {
                next = first + second;
                first = second;
                second = next;
                System.out.println(next);
            }
        }
        return next;
    }
}
