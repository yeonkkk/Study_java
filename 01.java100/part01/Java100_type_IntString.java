package java_practice.variable;

// 정수-문자열 변환
// 정수형끼리의 연산이 아닌 경우 더하기 연산 등을 수행했을 때 문자가 합쳐지는 결과가 나올 수 있기 때문
// 연산 외에도 메서드 호출 시 인자 값을 정수로 보내서 문자열로 처리하는 또는 반환하는 경우에도 필요

public class Java100_type_IntString {
    public static void main(String[] args) {

        // 정수 선언
        int a = 12345;
        String str = "12345";
        // System.out.println(a.length()); // Err
        System.out.println(str.length()); // 5

        // 정수 -> 문자열 변환 -> 자릿수 구하기
        String stra = String.valueOf(a);
        System.out.println(stra.length());

        // 문자열 + 정수형
        System.out.println(12345+1); //12346
        System.out.println(str+1); //12345+1 = 123451
        
        // 문자열 -> 정수 변환
        int b = Integer.valueOf(str);
        System.out.println(b+1); //12346

    }
}
