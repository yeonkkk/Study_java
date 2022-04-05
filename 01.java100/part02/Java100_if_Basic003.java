package java_practice;

public class Java100_if_Basic003 {
    public static void main(String[] args) {

        int kor=100, eng=80, math=90;
        int total_score;
        total_score = kor + eng + math;
        
        // if ~ else if ~ else 조건문 사용 -> 코드를 한 줄씩 작성했기 때문에 중괄호 생략 가능
        if(total_score>=270) 
            System.out.println("당신의 토탈 점수는"+total_score+"입니다. 매우 잘 했어요.");
        else if(total_score>=240)
            System.out.println("당신의 토탈 점수는"+total_score+"입니다. 잘 했어요.");
        else if(total_score>=210)
            System.out.println("당신의 토탈 점수는"+total_score+"입니다. 노력하세요.");
        else
            System.out.println("당신의 토탈 점수는"+total_score+"입니다. 분발하세요.");
    }
}
