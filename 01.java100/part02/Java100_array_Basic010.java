package java_practice;

public class Java100_array_Basic010 {
    public static void main(String[] args) {

        // String 1차원 배열
        // 3개의 문자열을 담을 수 있는 배열 생성하기
        // String 타입의 참조 변수 3개를 저장하기 위한 공간 생성
        // 기본값 null로 초기화
        String[] provice = new String[3];
        System.out.println(provice[0]);     // null
        System.out.println(provice[1]);     // null
        System.out.println(provice[2]);     // null

        // String 배열 초기화
        provice[0] = "강원도";
        provice[1] = "전라도";
        provice[2] = "경상도";
        System.out.println(provice[1]);     // "전라도"

        // String 배열 초기화
        String[] nation = new String[] {"한국", "미국", "중국"};
        System.out.println(nation[1]);     // "미국"

        String[] flower = new String[] {"무궁화", "해바라기", "개나리"};
        System.out.println(flower[1]);     // "해바라기"     

        // 반복문을 사용하여 배열 값 모두 출력
        for(int i=0; i<flower.length; i++){
            System.out.println(flower[i] + " ");
        }
        System.out.println();

        // 향상되 for문으로 배열 요소 출력
        for(String aaa:nation)
            System.out.print(aaa + " ");
        System.out.println();
    }   
}
