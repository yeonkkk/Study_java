package java_practice;

public class Java100_if_ThreeOperator {
    public static void main(String[] args) {

        // 변수 선언
        int hour = 11;

        // 삼항 연산자 테스트 -> 10보다 작거나 같으면 100 곱하기
        int test = hour <=10 ? hour*100:hour;
        System.out.println(test);

        // 삼항 연산자를 이용하여 12시보다 작으면 오전, 크면 오후 출력
        String ampm = hour < 12 ? "오전":"오후";
        System.out.println(ampm);
    }
}
