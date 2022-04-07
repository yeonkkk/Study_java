package java_practice;
import java.util.Arrays;

public class Java100_array_OneTwoArray3 {
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

        // 반복문을 사용한 String 2차원 배열 값 출력(이중 반복문)
        for(int i=0; i<asia_nations.length; i++){
            for(int j=0; j<asia_nations[i].length; j++){
                System.out.print(asia_nations[i][j] + " ");
            }
            System.out.println();
        }

        // charAt() 메서드: 해당 인덱스에 있는 값 반환 -> 단어를 char 배열에 한글자씩 저장 가능
        String[] strAr = {"hong", "kim", "park"};
        System.out.println(strAr[0].charAt(2)); // n
        System.out.println(strAr[1].charAt(2)); // m
        System.out.println(strAr[2].charAt(2)); // r

        // System.out.println(strAr[0].length); // err

        // 반복문에서 charAt 메서드 사용
        for(int i=0; i<strAr.length; i++){
            for(int j=0; j<strAr[i].length(); j++){
                System.out.print(strAr[i].charAt(j));
            }
            System.out.println();
        }

        // length vs length() 차이
        int[] aaa = new int[10];
        System.out.println(aaa.length);     // 10

        String bbb = "Welcome to seoul";
        System.out.println(bbb.length());   // 16

    }   
}
