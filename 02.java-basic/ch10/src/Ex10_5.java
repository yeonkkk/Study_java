import java.util.Calendar;

public class Ex10_5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Ex10_5 2022 8");
            return;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        // 시작일과 끝일
        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        // 월의 경우 0~11의 값을 가지므로 1을 빼준다.
        sDay.set(year, month - 1, 1);
        eDay.set(year, month, 1);

        // 다음 달의 1일에서 하루를 빼면 현재 달의 마지막 날이 된다.
        eDay.add(Calendar.DATE, -1);

        // 첫 번째 요일 확인
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        // eDay에 지정된 날짜 가져오기
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("    " + args[0] + "년 " + args[1] + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일이 어느 요일인지에 따라서 공백 출력 - 만일 1일이 수요일이면 공백 3번 (시작: 일요일)
        for (int i = 1; i < START_DAY_OF_WEEK; i++) System.out.println("   ");

        for (int i = 1, n = START_DAY_OF_WEEK; i < END_DAY; i++, n++) {
            System.out.println((i < 10) ? "  " + i : " " + i);
            if(n % 7 == 0) System.out.println();
        }


    }
}
