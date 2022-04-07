package java_practice;

public class Java100_array_Basic005 {
    public static void main(String[] args) {

        // 배열 선언과 동시에 특정 값으로 선언
        int[] sales_table = {33, 52, 93, 100, 87};

        // 반복문을 사용하여 모든 값 출력
        for (int i=0; i<sales_table.length; i++) {
            System.out.print(sales_table[i] + " ");
        }
        System.out.println();
    }
}
