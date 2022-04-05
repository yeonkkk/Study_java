package java_practice.variable;

public class Java100_variable_DataType4 {
    public static void main(String[] args) {

        byte b = 10;
        short s = 32767;
        int i = 210000000;
        long l = 700000000000L;
        float f = 9.8F;
        double d = 3.14;
        char c = 'A';
        boolean bl = false;

        // print(), pirntln()
        System.out.print("안녕하세요~");
        System.out.print("홍길동입니다.");
        System.out.println();
        System.out.println("안녕하세요~");
        System.out.println("홍길동입니다.");
        
        // printf() 출력--> 지시자를 출력 
        // %d(정수), %f (소숫점 형식), %c (문자), %b (부울), %n (줄바꿈), %e (지수), %o (8진수), %x (16진수)
        System.out.printf("나는 %d살의 대학생입니다. %d %d %d %.1f %.2f, %c %n %b %n ", b, s, i, l, f, d, c, bl);   // 순서대로 매칭
        System.out.printf("10진수 10은 8진수로는 %o이고, 16진수로는 %x이다.", b, b);

    }    
}
