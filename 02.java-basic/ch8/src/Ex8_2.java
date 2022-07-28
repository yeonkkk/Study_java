public class Ex8_2 {
    public static void main(String[] args) {
        try {
            System.out.println(0 / 0);
            System.out.println(2);
        } catch (ArithmeticException ae) {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
