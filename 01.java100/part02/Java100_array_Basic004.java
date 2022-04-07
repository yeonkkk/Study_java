package java_practice;

public class Java100_array_Basic004 {
    public static void main(String[] args) {

        // 배열 선언고 동시에 특정 값을 초기화
        int [] sales_table = {55, 88, 60, 100, 90};
        System.out.println(sales_table[1]); //88

        // 2번째 방법
        int [] sales_table2 = new int[] {55, 88, 60, 100, 90};
        System.out.println(sales_table2[2]); //60

        // 3번째 방법
        int [] sales_table3;
        sales_table3 = new int[] {55, 88, 60, 100, 90};
        System.out.println(sales_table3[3]); //100

    }
}
