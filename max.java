import java.util.Arrays;

public class MAXARRAY {
    public static void main(String[] args) {
        int[] a = {5, 3, 1, 4, 2};
        Arrays.sort(a);
        int max = a[a.length - 1];
        System.out.println("Max is " + max);
    }
}
