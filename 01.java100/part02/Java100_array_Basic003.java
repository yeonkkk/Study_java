package java_practice;

public class Java100_array_Basic003 {
    public static void main(String[] args) {
        
        // 배열 선언
        int[] sales_table = new int[5];
        sales_table[0] = 3;
        sales_table[1] = 11;
        sales_table[2] = 22;
        sales_table[3] = 33;
        sales_table[4] = 44;
        
        // 값 출력하기
        System.out.println(sales_table[0]);     // 3
        System.out.println(sales_table[1]);     // 11
        System.out.println(sales_table[2]);     // 22
        System.out.println(sales_table[3]);     // 33
        System.out.println(sales_table[4]);     // 44
        System.out.println(sales_table.length); // 5
        System.out.println(sales_table[sales_table.length-1]);    // 44

    }
}
