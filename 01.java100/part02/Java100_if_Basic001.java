package java_practice;

public class Java100_if_Basic001 {
    public static void main(String[] args){
        
        int kor=80, eng=90, math=100;

        // if 조건문 -> 한 줄만 작성하는 경우 중괄호 생략 가능 (2줄 이상일 땐 불가)
        if (kor>80) 
            System.out.println("당신의 국어 점수는 B학점 입니다.");    
        
        System.out.println("학점이 안나왔다면 80점 미만이기 때문입니다.");
        System.out.println("------------------------------------------------------------");


        // if ~ else 조건문 사용하기 -> if ~else 문은 중괄호 필수 !
        if (eng>90){
            System.out.println("A학점입니다.");
            System.out.println("축하합니다.");
        }
        else {
            System.out.println("90점 미만입니다.");
        }
    }
}