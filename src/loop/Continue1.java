package loop;

public class Continue1 {
    //while(조건식) { 코드1;
    //continue;  -> 즉시 조건식으로 이동한다.
    //코드2; }

    //`continue` 를 만나면 `코드2` 가 실행되지 않고 다시 조건식으로 이동한다.
    // 조건식이 참이면 `while` 문을 실행

    public static void main(String[] args) {

        //문제: 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다
        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; }
            System.out.println(i);
            i++; }
    }
}
