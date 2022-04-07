package java_practice;
import java.util.Arrays;

public class Java100_array_OneTwoArray2 {
    public static void main(String[] args) {

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

        // String 2차원 배열 만들기 2x3 shape
        // 아시아 -> 동북(한국, 중국, 일본), 동남(태국, 베트남, 필리핀)
        String[] [] asia_nations = {
            {"한국", "중국", "일본"}, 
            {"태국", "베트남", "필리핀"}
        };
        System.out.println(Arrays.toString(asia_nations));          // [[Ljava.lang.String;@36baf30c, [Ljava.lang.String;@7a81197d] 
        System.out.println(Arrays.toString(asia_nations[0]));       // [한국, 중국, 일본]
        System.out.println(asia_nations[1][1]);       // 베트남

        System.out.println(asia_nations.length); // 2
        System.out.println(asia_nations[0].length); // 3


    }   
}
