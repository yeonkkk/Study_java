package java_practice;
import java.util.Arrays;

// 배열을 복사하는 메서드 -> arraycopy()
// System.arraycopy(원본배열명, 시작 인덱스, 복사배열명, 대체할 인덱스 시작, 길이);

public class Java100_array_Basic009 {
    public static void main(String[] args) {
        
        // ar, ar2 배열 선언
        int[] ar = {1, 2, 3, 4, 5};
        int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 배열 복사하기 -> System.arraycopy()
        System.arraycopy(ar, 2, ar2, 4, 3);
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2)); // [1, 2, 3, 4, 3, 4, 5, 8, 9, 10]

    }
}
