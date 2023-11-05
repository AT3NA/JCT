public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change this to the number of Fibonacci terms you want to print
        long a = 0, b = 1;

        System.out.print("Fibonacci Sequence up to " + n + " terms: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long sum = a + b;
            a = b;
            b = sum;
        }
    }
}

//Fibonacci Sequence up to 10 terms: 0 1 1 2 3 5 8 13 21 34 
