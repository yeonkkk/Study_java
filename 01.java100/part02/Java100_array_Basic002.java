package java_practice;

public class Java100_array_Basic002 {
    public static void main(String[] args) {

        // 배열의 선언 및 크기 지정
        int [] scores = new int[10];
        int s_size = scores.length;

        // 선언한 배열을 인덱스로 접근하여 값 출력
        System.out.println(scores[0]);           // 0
        System.out.println(scores[9]);           // 0
        // System.out.println(scores[10]);       // Err
        System.out.println(scores[s_size-1]);    // 0 (배열크기 - 1)

    }
}
