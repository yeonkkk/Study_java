package java_practice;

public class Java100_if_Basic004 {
    public static void main(String[] args) {

        int kor=60, eng=60, math=60;
        int total_score;
        total_score = kor + eng + math;
        
        // if ~ else if ~ else 조건문 사용 
        if(total_score>=270) 
            System.out.println("당신의 토탈 점수는"+total_score+"입니다. 매우 잘 했어요.");
        else if(total_score>=240)
            System.out.println("당신의 토탈 점수는"+total_score+"입니다. 잘 했어요.");
        else if(total_score>=210)
            System.out.println("당신의 토탈 점수는"+total_score+"입니다. 노력하세요.");
        else
            if(math>=60)
                System.out.printf("당신의 토탈 점수는 %d점 이고, 수학점수는 %d입니다. 수학이 60점 이상이므로 재수강 대상자가 아닙니다.%n", total_score, math);
            else 
                System.out.printf("당신의 토탈 점수는 %d점 이고, 수학점수는 %d입니다. 수학이 60점 미만이므로 재수강 대상자입니다.%n", total_score, math);
    }
}
