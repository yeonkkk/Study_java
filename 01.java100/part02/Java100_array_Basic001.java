package java_practice;

// 배열은 동일한 데이터 타입의 값들을
// 하나의 배열명으로 저장시킬 수 있는 아주 편리한 자료구조

public class Java100_array_Basic001 {
    public static void main(String[] args) {

        // 첫 번째 방식
        int [] sales_table = new int[100];
        
        // 두 번째 방식
        double [] sales_table2;
        sales_table2 = new double[100];

        // 선언한 배열 사용
        System.out.println(sales_table[0]); //0
        System.out.println(sales_table2[0]); //0.0

    }
}
