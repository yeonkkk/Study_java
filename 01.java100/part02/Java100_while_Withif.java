package java_practice;

public class Java100_while_Withif {
    public static void main(String[] args) {

        // 변수 선언
        int number = 1;

        // 반복문 돌면서 홀수, 짝수 체크
        while(number <= 30) {
            // 짝수이면 출력
            if (number%2 == 0)
                System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }
}
