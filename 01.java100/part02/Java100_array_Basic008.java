package java_practice;
import java.util.Arrays;

// 다중 배열 선언

public class Java100_array_Basic008 {
    public static void main(String[] args) {

        // 1
        int [] a, b, c;

        // 2
        int d[], e[], f[];

        // 3
        int g[], h;

        a = new int [3];
        b = new int [3];
        c = new int [3];
        System.out.println(Arrays.toString(a));

        d = new int [3];
        e = new int [3];
        f = new int [3];
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));

        g = new int [3];
        // h = new int [3];  // err
        System.out.println(Arrays.toString(g));
        // System.out.println(Arrays.toString(h)); // err

    }
}
