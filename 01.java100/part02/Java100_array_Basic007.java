package java_practice;
import java.util.Arrays;

public class Java100_array_Basic007 {
    public static void main(String[] args) {

        // 반복문을 사용하지 않고 배열의 값 출력 -> Arrays.toString() 메서드
        // Arrays.toString(배열명)
        // java.util.Arrays 임포트

        // 배열 선언
        int[] ar = {238, 483, 239, 442, 487, 239, 873};

        // toString() 메서드 사용하여 값 출력
        System.out.println(Arrays.toString(ar));    // [] 괄호의 형태로 배열 표시를 보여주며 출력
        System.out.println(ar[0]); //238

        // for 문
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
