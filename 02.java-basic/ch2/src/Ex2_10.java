import java.util.Scanner;

public class Ex2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수를 하나 입력해주세요 >");
        String input = scanner.nextLine(); // 입력 받은 내용 input에 저장
        int num = Integer.parseInt(input); // 문자열 -> 숫자 변환

        System.out.println("입력 내용 = " + input);
        System.out.printf("num = %d%n", num);
    }
}
