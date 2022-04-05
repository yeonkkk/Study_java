package java_practice.variable;

public class Java100_variable_DataType2 {
    public static void main(String[] args) {

        // 기본형 타입
        byte b = 100;
        short s = 30000;
        int i = 2100000000;
        long l = 7000000000L;   // long은 접미사 필수 (l, L)
        float f = 9.8F;         // float은 접미사 필수 (f, F)
        double d = 3.14;
        char c = 'A';
        boolean bl = false;

        System.out.println(b + "최댓값-->" + Byte.MAX_VALUE);
        System.out.println(s + "최댓값-->" + Short.MAX_VALUE);
        System.out.println(i + "최댓값-->" + Integer.MAX_VALUE);
        System.out.println(l + "최댓값-->" + Long.MAX_VALUE);
        System.out.println(f + "최댓값-->" + Float.MAX_VALUE);
        System.out.println(d + "최댓값-->" + Double.MAX_VALUE);
        System.out.println(c + "최댓값-->" + (int)Character.MAX_VALUE);
        System.out.println(bl);


    }
}
