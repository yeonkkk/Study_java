package java_practice.variable;

public class Java100_operator_ArithmeticOperators2 {
    public static void main(String[] args) {

        // 정수끼리라도 나누기의 경우 소숫점 형태가 나올 수 있음
        int a=60, b=8;
        int rst1; double rst2, rst3, rst4;

        rst1 =a/b;
        System.out.println(rst1);       // 7 출력
        System.out.println((double)rst1); // 7.0 출력

        rst2 = a/(double)b;     // 어느 한 쪽의 값을 double 타입으로 변환
        System.out.println(rst2);     // 7.5

        rst3 = 100/(double)3;
        rst4 = 250/3.0;
        System.out.println(rst3);      // 33.333
        System.out.printf("세 과목의 평균은 %.1f입니다 %n", rst4);      // 33.333

    }
}
