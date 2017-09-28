// do the fibonacci sequence to 4 million
// add the even values

// 44 is solution for fibonacci to 10 add up the even

public class FibSum {
    int sum = 0;
    int fib = 0;
    int low = 0; // 1
    int high = 1; // 2
    public void calculateSum() {

        while (fib <= 4000000) {
             fib = low + high; // 3
             low = high; // 3
             high = fib; // 5
             //System.out.print(fib + ", ");
             if (fib % 2 == 0) {
                 sum += fib;
             }
            // 1, 2, 3, 5
        }
        System.out.print(sum);

    }

    public static void main(String[] args) {
        FibSum soln = new FibSum();
        soln.calculateSum();
    }
}
