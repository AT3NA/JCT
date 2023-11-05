import java.util.Arrays;
public class ArraySum {
    public static void main(String[] args) {
        int[] a = {5, 3, 1, 4, 2};
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        System.out.println("Sum of the array is: " + sum);
    }
}
