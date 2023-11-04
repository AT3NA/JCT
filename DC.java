import java.util.Arrays;
public class DECEND {
    public static void main(String[] args) {
        int[] a = {88,44,55,77,666,33};
        Arrays.sort(a);
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
