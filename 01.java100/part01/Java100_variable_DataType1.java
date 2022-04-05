package java_practice.variable;

public class Java100_variable_DataType1 {
    public static void main(String[] args) {
        int a;               //--- 정수가 저장될 변수 이름 a;;
        int b; int c = 90;      
        double d;            //--- 실수가 저장될 변수이름 d;;
        char e;              //--- 실수가 저장될 변수이름 e;;

        a = 10;
        // d = 10;             //--- 정수 10을 입력하면 10.0으로 출력;;
        // e = "A";            //--- 쌍 따옴표 에러;;
        d = 3.14;
        e = 'A';

        System.out.println(a);
        // System.out.println(b); // b 선언 후 초기화하지 않아 에러;;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // 여러 개의 변수 선언 및 초기화 --> 선언 후 값을 세팅
        int w;
        // int x, y, z = 900;          // z만 초기화되고 x, y는 초기화 불가
        w = 100;
        
        System.out.println(w);
        // System.out.println(z);
        // System.out.println(x);   // 초기화 오류 발생

        int x=300,y=400,z=500;
        System.out.println(x + "-" + y + "-" + z);

        // 같은 값 초기화
        String str1, str2, str3;
        str1 = str2 = str3 ="korea";
        System.out.println(str1 + "-" + str2 + "-" + str3);

    }
}
